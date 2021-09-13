package lectures.part1basics

// Expressions
// - Mathematical: + - * / & | ^ << >> >>> (right shift with zero extension)
// - Relational: == != > < >= <=
// - Binary: ! && ||
// - Side effects: -= *= /= +=

// Instructions (DO) vs Expressions (VALUE)
// - Instructions do something, such as printing something to console
// - Expressions evaluate to a value
// - In Scala, think in terms of expressions

// Everything in Scala besides declarations and package declarations are expressions
// - Even loops such as while statements are expressions
// - Instructions are executed, expressions are evaluated

// Loops in Scala are discouraged due to "imperative"ness
// - NEVER USE WHILE LOOPS

// Code blocks are created with {} braces
// - Value of a code block are the value of the last expression
// - Create a nested scope, variables are not available outside

object Expressions extends App {
  val x = 1 + 2
  println(x)
  println(2 + 3 * 4)
  println(1 == x)
  println(!(1 == x))

  var anInt = 2
  anInt += 5
  println(anInt)

  val aCondition = true
  val aConditionalValue = if (aCondition) 5 else 3 // Expression, rather than an instruction
  println(aConditionalValue)
  println(if (aCondition) 4 else 4)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // Even following is an expression
  val aWeirdValue = (anInt = 3) // Unit type, which is same as void
                                // Unit type is represented as ()
  print(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + anInt

    if (z > 5) "hello" else "goodbye" // Value of the code block
  }
  print(aCodeBlock)
}
