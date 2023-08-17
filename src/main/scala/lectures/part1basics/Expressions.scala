package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  // + - * / & | ^ << >> >>>
  // == != > >= < <=
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=

  // Instructions (DO) vs Expressions
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue: Unit = aVariable = 3 // Unit == void
  print(aWeirdValue)

  val aCodeBlock = {
    val aWeirdValue = 2

    if (aWeirdValue == 2) 2 else 3
  }

  println(aCodeBlock)
}
