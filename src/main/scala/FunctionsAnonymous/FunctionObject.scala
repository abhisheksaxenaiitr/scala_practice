package FunctionsAnonymous

object FunctionObject extends App {
  val sum = new FunctionClass
  println(sum.add(3,5))

  val adding = (x: Int, y: Int) => x + y

  println(adding(5, 6))
}

