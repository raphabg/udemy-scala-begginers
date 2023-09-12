package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println(
        "Computing factorial of " + n + " - I first need factorial of " + (n - 1)
      )
      var result = n * factorial(n - 1)
      println(s"Computed factorial of $n")

      result
    }
  }

  //factorial(5000)

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // TAIL RECURSION
    }

    factorialHelper(n, 1)
  }

  println(anotherFactorial(5))
  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.

  /*
   * 1. Concatenate a string n times
   * 2. IsPrime function tail recursive
   * 3. Fibonacci function, tail recursive
   * */

  @tailrec
  def concatenateRecursive(
      string: String,
      n: Int,
      accumulator: String = ""
  ): String = {
    if (n <= 0) accumulator
    else concatenateRecursive(string, n - 1, string + accumulator)
  }

  println(concatenateRecursive("a|", 7))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailrec(n / 2, isStillPrime = true)
  }

  @tailrec
  def fibonacciRecursive(
      desiredPos: Int,
      current: Int = 0,
      previous: Int = 0,
      recursionLevel: Int = 0
  ): Int = {
    if (recursionLevel < desiredPos) {
      if (recursionLevel == 0)
        fibonacciRecursive(desiredPos, 1, 0, 1)
      else
        fibonacciRecursive(
          desiredPos,
          current + previous,
          current,
          recursionLevel + 1
        )
    } else current
  }

  println(fibonacciRecursive(20))
}
