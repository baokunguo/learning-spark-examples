square_(10+1)
square_(square_(4))
sumOfSquares_(3,2+2)
// never stop
// first_(1,loop)
constOne(1,loop)
gcd(39,13)
gcd(14,21)

21 % 14

factorial(5)

"hello" * 7
30 + 14

def square_(x:Double): Double ={
  x*x
}
// call by value: reduce the parameter to
// values before run following functions
// the default method is call-by-value
// it can change to call-by-name by preceded by =>

def sumOfSquares_(x: Double, y: Double)
= square_(x) + square_(y)

def constOne(x: Int, y: => Int) = 1

def loop:Int = loop

def first_(x: Int, y: Int) = x

def abs_(x: Double) = if(x >= 0) x else (-x)

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess,x)) guess
  else sqrtIter(improve(guess, x), x)

def improve(guess: Double, x: Double) = (guess + x/guess)/2

def isGoodEnough(guess: Double, x: Double) = abs_(square_(guess) - x) < 0.0001

def sqrt(x: Double) = sqrtIter(1.0, x)

def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)

def factorial(n: Int): Int = if(n == 0) 1 else n*factorial(n-1)