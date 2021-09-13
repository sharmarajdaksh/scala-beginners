package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.toUpperCase())
  println(str.toLowerCase())
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello,"))
  println(str.replace(" ", "-"))
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println(aNumber)

  // Prepending operator: +:
  // Appending operator :+
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators
  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello I am $name and my age is $age"
  println(greeting)
  val anotherGreeting = s"Hello I am $name and my age is ${age + 1}"
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2990F
  val myth = f"$name can eat $speed%2.2f burgers per minute" // also type checks
  println(myth)

  // raw interpolators
  println(raw"This is a \n newline") // ignores \n
  val escaped = "This is a \n newline"
  println(raw"$escaped") // Does not ignore \n. Newline is printed
}
