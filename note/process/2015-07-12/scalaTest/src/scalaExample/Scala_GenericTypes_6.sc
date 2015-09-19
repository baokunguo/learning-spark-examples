// stacks : push, pop, isEmpty
abstract class Stack[A]{
  def push(x: A): Stack[A] = new NonEmptyStack[A](x,this)
  def isEmpty: Boolean
  def top: A
  def pop: Stack[A]
}

class EmptyStack[A] extends Stack[A]{
  def isEmpty = true
  def top = error("EmptyStack.top")
  def pop = error("EmptyStack.pop")
}

class NonEmptyStack[A](elem: A, rest: Stack[A]) extends Stack[A]{
  def isEmpty = false
  def top = elem
  def pop = rest
}

// example
val x = new EmptyStack[Int]
var y = x.push(1).push(2)
println(y.pop.top)

def isPrefix[A](p: Stack[A], s: Stack[A]): Boolean = {
  p.isEmpty ||
  p.top == s.top && isPrefix[A](p.pop, s.pop)
}