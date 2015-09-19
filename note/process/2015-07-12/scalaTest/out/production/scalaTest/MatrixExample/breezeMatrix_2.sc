/*matrix computation*/
import breeze.linalg._
val randM_1 = DenseMatrix.rand[Double](3,3)
val randM_2 = DenseMatrix.rand[Double](3,3)
val rand_ele_multip = randM_1 :* randM_2
randM_1 :< randM_2
println("Dot")
//DenseVector[Double](3,1) dot DenseVector.rand[Double](3,1).t

/*distribution*/
import breeze.stats.distributions._
val poi = new Poisson(4)
val s = poi.sample(50)
s map {poi.probabilityOf(_)}

val doublePoi = for (x <- poi) yield x.toDouble

breeze.stats.meanAndVariance(doublePoi.samples.take(1000))

poi.mean
poi.variance
