val randomNum = math.random
val intMax = Int.MaxValue

for (i <- 1 until 5) {
  if (i % 2 == 0) println("even") else println("odd")
  println(i + " the iternation of metho UNTIL \n " )
}

for (i <- 1 to 5){
  println(i + " the iternation of method TO")
}

val arrayNum = (0 until 19).toArray

println(arrayNum + " array Num ")

val startime = System.nanoTime()
println("this is the system nano time" + startime)

println(randomNum.toString + "is the random" )