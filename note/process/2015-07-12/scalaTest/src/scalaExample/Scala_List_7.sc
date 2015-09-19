/*immutable/same type/
* */
val fruit: List[String]
  = List("apple","orange","Pears","LastOne")
"Nil"::fruit
"apples"::("orange"::("pears"::Nil))
"apples"::"orange"::"pears"::Nil

fruit.head
fruit.tail
fruit.isEmpty
fruit(1)
fruit.length

for(i <- fruit)
  println(i + "GBK")
val numbers:List[Double] = 1.0::2.0::3.0::5.0::Nil
println(numbers)

//insert sort
def insertSort(xs:List[Double]):List[Double] =
  if(xs.isEmpty) Nil
  else insertT(xs.head, insertSort(xs.tail))

def insertT(heada: Double, tails: List[Double])
  :List[Double] = {
  if (tails.length == 1){
    if (tails.head > heada){
      tails.head::heada::Nil
    }else {
      heada::tails.head::Nil
    }
  } else {
    if(heada > tails.head)
      heada::tails
    else
      tails.head::insertT(heada,tails.tail)
  }
}

insertSort(4.0,numbers)