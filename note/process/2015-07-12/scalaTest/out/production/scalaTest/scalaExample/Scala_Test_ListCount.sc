def f(arr:List[Int]):Int = {
  var i:Int = 0
  for (j <- arr){
    i = i+1
  }
  i
}

val arrList:List[Int] = List(1,2,9,19)
f(arrList)

/**
object ScannerTest {
  def main(args:Array[String])={
   println("Hello")
  }
}**/
scala.io.Source.stdin.getLines()