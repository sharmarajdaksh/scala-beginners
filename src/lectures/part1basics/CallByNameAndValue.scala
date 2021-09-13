package lectures.part1basics

object CallByNameAndValue extends App {
  def calledByValue(x: Long): Unit = {
    println("BYVAL:", x)
    println("BYVAL:", x)
  }

  // When call by name is used, an expression is itself passed into the function
  def calledByName(x: => Long): Unit = {
    println("BYNAME:", x)
    println("BYNAME:", x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  // By Name calls delay expression evaluation until the parameter is used
  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = println(x)

//  printFirst(infinite(), 34) // Crashes with stack overflow because x gets evaluated on call
  printFirst(34, infinite()) // Prints correctly as the parameter "y" NEVER gets evaluated
}
