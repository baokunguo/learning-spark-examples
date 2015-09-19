import java.util.Random

import breeze.linalg.{Vector,DenseVector}

val N = 10000  // Number of data points
val D = 10   // Numer of dimensions
val R = 0.7  // Scaling factor
val ITERATIONS = 5
val rand = new Random(42)

case class DataPoint(x: Vector[Double], y: Double)
println(rand.nextGaussian() + " is gaussian")
val dv = DenseVector.fill(N){rand.nextGaussian()}
dv.length
DataPoint(dv,1)


