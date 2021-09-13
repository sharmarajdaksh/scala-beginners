package lectures.part1basics

import scala.annotation.tailrec

// Similar default args, kwargs as Python
object DefaultArgs extends App {
  @tailrec
  def trFact(n: Int, acc: Int = 2): Int = {
    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }

  val fact10 = trFact(10, 1)
  println(fact10)

  val fact5 = trFact(acc = 1, n = 5)
  println(fact5)
}
