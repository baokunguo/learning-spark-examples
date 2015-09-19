package sparkExample

/**
 * Created by root on 15-8-2.
 * Project: ${Project_name}.
 *
 * Just for Matrix.
 */

import org.apache.spark.{SparkContext, SparkConf}
import scala.math._
object SparkPi {
  def main(args: Array[String]) {
    val conf = new SparkConf()
      .setAppName("Spark Pi")
      .setMaster("local")
    val spark = new SparkContext(conf)
    val slices = if (args.length > 0) args(0).toInt else 3
    val n = math.min(100000L * slices, Int.MaxValue).toInt // avoid overflow
    val count = spark.parallelize(1 until n, slices).map { i =>
        val x = random * 2 - 1
        val y = random * 2 - 1
        if (x*x + y*y < 1) 1 else 0
      }.reduce(_ + _)
    println("Pi is roughly " + 4.0 * count / n)
    spark.stop()
    System.exit(0)
  }
}