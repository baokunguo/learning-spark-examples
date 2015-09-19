/*matrix & vector basic operation
*
* https://github.com/scalanlp/breeze/wiki/Quickstart
* */
import breeze.linalg._
val x = DenseMatrix.zeros[Double](3,3)
val m = DenseMatrix.zeros[Int](5,5)
val xvec = DenseVector.zeros[Double](5)
xvec(1) = 10
xvec
3 to 14
xvec(3 to 4) := 0.9
xvec
(x.rows,x.cols)
x(::,1)
x(2,::)
//x(2,::) := DenseVector(1,3,123)
m(2,::) := DenseVector(1,3,123,11,99).t
m(0 to 1, 0 to 1) := DenseMatrix((3,1),(-1,-2))
m

/*broadcast*/

import breeze.stats.mean
val dm = DenseMatrix((2.0,12.0,22.2),
  (89.8,78.2, 123.9))
val res = dm(::,*) + DenseVector(3.0,4.0)
res
mean(dm(*,::))

import breeze.stats.distributions._
val poi = new Poisson(3.0)

val poisample = poi.sample(3)
poisample.map(poi.probabilityOf(_))


