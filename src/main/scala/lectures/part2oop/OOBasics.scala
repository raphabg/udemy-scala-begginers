package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Raphael Balogo", 24)
  println(person.x)
  person.greet("João")
  person.greet()
}

class Person(name: String, val age: Int) {
  def this(name: String) = this(name, 0)
  //body
  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name!")

  //overload
  def greet(): Unit = println(s"Hi, I am $name.")
}

// class parameters are NOT FIELDS
