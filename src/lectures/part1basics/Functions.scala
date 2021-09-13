package lectures.part1basics

// Functions are defined with def
// def aFunction(a: String, b: Int): String = {
//   a + " " + b
// }

// Functions without parameters can be called without parenthesis ()
// val a = myFunction

// In FP, when you need loops, use Recursion

// Like vals and vars, Scala can infer return types of functions by itself
// HOWEVER, recursive functions' return types cannot be inferred (which is logical)

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  val anInt = 9
  val aString = "World"
  val anEvaluated = aFunction(aString, anInt)
  println(anEvaluated)

  def aParameterLessFunction(): String = "Some"

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hello,", 3))

  // Following function only does side effects
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  aFunctionWithSideEffects("ABC")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }
  println(aBigFunction(9))

  def greeting(name: String, age: Int): Unit = "Hi, my name is " + name + " and I am " + age + " years old"
  println(greeting("Dex", 10))

  def factorial(n: Int): Int = {
    if (n == 1 || n == 0) 1
    else n * factorial(n - 1)
  }
  println(factorial(5))

  def fibonacci(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(9))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) return true
      else n % t != 0 && isPrimeUntil(t - 1)
    }
    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 13))
}
