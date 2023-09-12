package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(3, 3))
  println(str.split(", I am learning").toList)
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.length)

  println(str.reverse)
  println(str)

  println(str.take(2))

  // Scala specific: String interpolators.

  // s-interpolators
  val name = "David"
  val age = 12

  val greeting = s"Hello, my name is $name and my age is $age"
  val anotherGreeting = s"Hello, my name is $name and my age is ${age + 1}"

  // f-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"

  println(myth)

  // raw interpolator

  println(raw"This is not a \n newline")
}
