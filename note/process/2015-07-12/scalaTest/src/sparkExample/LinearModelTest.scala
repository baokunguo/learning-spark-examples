package sparkExample

import org.apache.spark.mllib.classification.SVMWithSGD
import org.apache.spark.mllib.evaluation.BinaryClassificationMetrics
import org.apache.spark.mllib.optimization.L1Updater
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.mllib.util.MLUtils
import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by root on 15-9-3.
 * Project: ${Project_name}.
 *
 * Just for Matrix.
 */
object LinearModelTest {
  def main (args: Array[String]) {

    val sparkConf = new SparkConf()
      .setAppName("LinearModelTest")
      .setMaster("local")

    val sc = new SparkContext(sparkConf)

    val fileBasicPath = "/media/Document/programm/" +
      "GitHub/spark_pre/spark/data/mllib/"
    val libsvm_data = MLUtils.loadLibSVMFile(sc,
      fileBasicPath + "sample_libsvm_data.txt")
    println(libsvm_data.count() + " is the count of the data")
    //libsvm_data.take(10).map {line => println("the libsvm data is " + line)}

    val splits = libsvm_data.randomSplit(Array(0.8,0.4), seed = 11L)
    println(splits.length + " is the length of the splits")

    val training = splits(0).cache()
    val test = splits(1)
    //training.take(10).map {line => println("the train data " +line)}
    //test.take(10).map {line => println("the test data " +line)}

    val numIternations = 10
    val model = SVMWithSGD.train(training,numIternations)

    model.clearThreshold()

    val scoreAndLabels = test.map {point =>
      val score = model.predict(point.features)
      (score,point.label)
    }

    val metric = new BinaryClassificationMetrics(scoreAndLabels)
    val auROC = metric.areaUnderROC()

    println("Area under ROC " + auROC)

    val svmAlg = new SVMWithSGD()
    svmAlg.optimizer
      .setNumIterations(200)
      .setRegParam(0.1).setUpdater(new L1Updater)

    val modelL1 = svmAlg.run(training)

    println(modelL1.weights.toString() + " is modelL1 weight")

    sc.stop()
    System.exit(0)
  }

}
