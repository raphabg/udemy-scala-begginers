package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Raphael Balogo", 24)
  println(person.x)
  person.greet("João")
  person.greet()
}

// class parameters are NOT FIELDS, only with the word `val` before
class Person(name: String, val age: Int) {
  //body
  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name!")

  //overload
  def greet(): Unit = println(s"Hi, I am $name.")

  // multiple constructors

  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

/*
 * Novel and a Writer
 *
 * Writer: first name, surname, yead
 * - method fullname
 *
 * Novel:
 * */
