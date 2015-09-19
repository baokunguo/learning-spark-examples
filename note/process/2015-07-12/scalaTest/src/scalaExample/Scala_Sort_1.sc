/*
* normal style
* */
val array_pre:Array[Int] = Array(12, 13,19,22,-3,-19,2)
Array.concat(array_pre.filter(10>),Array(100,200))



val array_backup = array_pre
sort(array_pre)
array_pre

val array_back:Array[Int] = Array(23, 90, 12, -19, 33, -22)
println(array_back +" is orig")
sort_scalaStyle(array_back)
array_back
println(" is deal result")

3/2

import breeze.linalg._
val x = DenseVector.zeros[Double](5)

/*
normal style of sort
*/
def sort(xs:Array[Int]): Unit ={


  def swap(i:Int, j:Int): Unit ={
    val t = xs(i)
    xs(i) = xs(j)
    xs(j) = t
  }

  def sort1(l:Int, r:Int): Unit ={
    val pivot = xs((l+r) / 2)
    var i = l
    var j = r
    while (i <= j){
      while (xs(i) < pivot) i += 1
      while (xs(j) > pivot) j -= 1
      if (i <= j){
        swap(i,j)
        i += 1
        j -= 1
      }
    }
    if(l < j) sort1(l,j)
    if(j < r) sort1(i, r)
  }
  sort1(0, xs.length -1)
}

def sort_scalaStyle(xs: Array[Int]):Array[Int] ={
  if (xs.length <= 1) xs
  else{
    val pivote = xs(xs.length / 2)
    Array.concat(sort_scalaStyle(xs filter(pivote >)),
      xs.filter(pivote ==),
      sort_scalaStyle(xs.filter(pivote <)))
  }
}