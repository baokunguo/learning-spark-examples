/*Rational class*/
var i = 1
var x = new Rational(1,1)
while (i <= 2){
  x += new Rational(1,i)
  i += 1
  println("" + x.numer + "/" + x.denom)
}

//class Rational(a:Int, b:Int) extends AnyRef {
class Rational(a:Int, b:Int){
  private def gcd(x:Int, y:Int):Int={
    if(x==0) y
    else if(x<0) gcd(-x,y)
    else if(y<0) -gcd(x,-y)
    else gcd(y%x, x)
  }

  private val g = gcd(a,b)

  val numer:Int = a/g
  val denom:Int = b/g

  def +(that:Rational) =
    new Rational(numer*that.denom + that.numer*denom,
    denom*that.denom)

  override def toString = "" + numer + "/" + denom
}