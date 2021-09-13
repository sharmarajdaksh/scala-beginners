package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  // Stack overflows for large n
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  // This doesn't overflow the stack
  // Why? This is tail recursive
  // The recursive call should be the last expression
  def anotherFactorial(n: Int): Int = {

    @tailrec // Annotate function as tailrec
    def factHelper(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }

    factHelper(20000, 1)
  }

  def concatenateNTimes(s: String, n: Int): String = {
    @tailrec
    def helper(s: String, n: Int, accumulator: String): String = {
      if (n <= 0) accumulator
      else helper(s, n - 1, accumulator + s)
    }

    helper(s, n, "")
  }
  println(concatenateNTimes("boo! ", 10))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def helper(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      if (t <= 1) true
      else helper(t - 1, n % t != 0 && isStillPrime)
    }

    helper(n / 2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    @tailrec
    def helper(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else helper(i + 1, last + nextToLast, last)
    }

    if  (n <= 2) 1
    else helper(2, 1, 1)
  }

  println(fibonacci(8))
}
