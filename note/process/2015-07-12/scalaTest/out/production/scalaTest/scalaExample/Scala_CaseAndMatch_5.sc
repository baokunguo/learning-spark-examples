/*case and match*/
/*problem decomposition*/
abstract class Expr{
  def eval:Int
}

class Number(n:Int) extends Expr{
  def eval:Int = n
}

class Sum(e1:Expr, e2:Expr) extends Expr{
  def eval:Int = e1.eval + e2.eval
}

class Prod(e1:Expr, e2:Expr) extends Expr{
  def eval:Int = e1.eval * e2.eval
}

/*add an operation on expressions*/

// methods 1: bad decomposition
// new sum(new Number(1),
// new Sum(new Number(3), New Number(7)))

def print(e:Expr): Unit ={
  //if (e.isNumber) Console.print(e.numValue)
  //else(e.isSum){....}
}

// object-oriented decompositions of expressions
abstract class Expr2{
  def eval:Int
  def print
}

class Number_2(n:Int) extends Expr2{
  def eval:Int = n
  def print {Console.print(n)}
}

class Sum_2(e1:Expr, e2:Expr) extends Expr2{
  def eval:Int = e1.eval + e2.eval
  def print {Console.print("e1")
    Console.print("+")
    Console.print("e2")}
}

class Prod_2(e1:Expr, e2:Expr) extends Expr2{
  def eval:Int = e1.eval * e2.eval
  def print {Console.print("prod")}
}

/*case classes and case objects*/
// implicitly come with a constructor function
// implicitly come with implementations of methods
// toString, equal and hashCode
// which override the methods with the same name in
// class AnyRef
abstract class ExprCase
case class NumberCase(n:Int) extends ExprCase
case class SumCase(e1:ExprCase, e2:ExprCase)
  extends ExprCase

// pattern matching expression
// e match { case p1 => e1, --- , case pn => en }

def evalCase(e:ExprCase):Int = e match {
    case NumberCase(n) => n
    case SumCase(l,r) => evalCase(l) + evalCase(r)
}

var value12 = evalCase(SumCase(NumberCase(1),NumberCase(2)))

abstract class IntTree
case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree)
  extends IntTree

def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case Node(e, l,r) => {
      if(v == e) true
      else if (contains(l,v) || contains(r,v)) true
      else false
    }
}

/* function combined */

val fComposeG = f _ compose g _

fComposeG(" yay ")
f(" yag ")

val fAndThenG = f _ andThen g _

fAndThenG(" yag ")


def f(s: String) : String = {
  " f( " + s + " ) "
}

def g(s: String) : String = {
  " g( " + s + " ) "
}

/*Partial Function*/
val one: PartialFunction[Int,String] = {case 1 => "One shit "}

one.isDefinedAt(1)
one.isDefinedAt(2)
one(1)


