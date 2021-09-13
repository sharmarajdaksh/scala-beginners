package lectures.part1basics

// val variables are immutable, and cannot be reassigned
// Type annotations like below are possible
//     x: Int = 42
// But they can be inferred automatically
//     y = 43

// Semicolons are optional

// Basic types in Scala:
// - String
// - Int
// - Boolean
// - Char
// - Short
// - Long
// - Float
// - Double

// var variables are mutable, used for side effects

// FP approaches encourage vals over vars

object ValuesVariablesTypes extends App {
  val x: Int = 42 // Immutable variable with type annotation
  println(x)

  val y = 43 // Inferred type

  val aString: String = "Hello";
  val bString = "Scala";

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 52311123L
  val aFloat: Float = 2.0F
  val aDouble: Double = 3.1457

  var aVariable: Int = 4
  aVariable = 5


}
