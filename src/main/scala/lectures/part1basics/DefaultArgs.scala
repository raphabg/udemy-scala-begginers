package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  println(trFact(7))

  def savePicture(format: String, width: Int, height: Int): Unit = println(
    "saving picture"
  )

  savePicture("jpg", 800, 600)

  /*
  default arg problems
   * 1. pass in every leading argument
   * or
   * 2. name the arguments
   * */
}
