/*function as a parameter*/


def sum_(f:Int => Int, a:Int, b:Int):Int={
  if(a>b) 0 else f(a) + sum_(f,a+1,b)
}

def id(x:Int):Int = x
def square_(x:Int):Int = x*x

def sumInts(a:Int, b:Int):Int = sum_(id, a,b)
def sumSquares(a:Int, b:Int):Int = sum_(square_, a, b)

/*anonymous functions*/
def sumInts_anonymous(a:Int, b:Int):Int = sum_((x:Int) => x, a, b)

/*returned function*/
def sum(f: Int => Int):(Int, Int) => Int = {

  def sumF(a:Int, b:Int): Int =
    if(a>b) 0 else f(a) + sumF(a+1,b)

  sumF
}

def sumInts = sum(x=>x)
def sumSquares_ = sum(x=>x*x)

sumSquares_(1,10)