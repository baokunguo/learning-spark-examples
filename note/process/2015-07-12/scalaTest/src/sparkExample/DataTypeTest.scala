package sparkExample

import org.apache.spark.mllib.linalg.{Matrices, Vectors}
import org.apache.spark.mllib.regression.LabeledPoint

/**
 * Created by root on 15-9-5.
 * Project: ${Project_name}.
 *
 * Just for Matrix.
 */
object DataTypeTest {
  def main(args: Array[String]) {
    val dv = Vectors.dense(1.0,0.0,3.0)
    println("dense format is " + dv.toString)

    val sv1 = Vectors.sparse(3,Seq((0,1.0),(2,3.0)))
    println("sparse format is " + sv1)

    val sv2 = Vectors.sparse(3,Array(0,2),Array(1.0,3.0))
    println("sparse format by index is " + sv2)

    //label index1:value1 index2:value2
    val pos = LabeledPoint(1.0,Vectors.dense(1.0,0.0,3.0))
    println("labeled Point is " + pos.toString())

    // matrices columns
    val dm = Matrices.dense(3,2,Array(1.0,3.0,5.0,2.0,4.0,6.0))
    println("Matrices is " + dm.toString())


  }

}
