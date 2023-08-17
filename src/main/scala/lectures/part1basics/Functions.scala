package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aParameterlessFunction(): Int = 42

  //println(aParameterlessFunction) works as well
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
		  Exercises:
		  1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
		  2. Factorial function
		  3. A Fibonacci function
			  f(1) = 1
			  f(2) = 1
			  f(n) = f(n - 1) + f(n - 2)
		  4. Tests if a number is prime.
   */

  // Exercise 1
  def greetingFunction(name: String, age: Int) =
    s"Hi, my name is $name and I am $age years old"

  println(greetingFunction("Raphael", 24))
  // Exercise 2
  def factorialFunction(factorial: Int): Int = {
    val fAbs = factorial.abs
    if (fAbs <= 0) return 1

    val result = fAbs * factorialFunction(fAbs - 1)

    if (factorial < 0)
      -result
    else
      result
  }

  println(factorialFunction(5))

  // Exercise 3
  def fibonacciFunction(n: Int): Int = {
    if (n == 1) return 1
    if (n <= 0) return 0

    fibonacciFunction(n - 1) + fibonacciFunction(n - 2)
  }

  println(fibonacciFunction(8))

  // Exercise 4
  def isPrimeNumber(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrimeNumber(37))
  println(isPrimeNumber(2003))
  println(isPrimeNumber(54))
}
