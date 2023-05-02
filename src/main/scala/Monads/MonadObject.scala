package Monads

object MonadObject extends App {
  def divide(a: Int, b: Int): Option[Int] = {
    if (b == 0) None else Some(a / b)
  }

  val result = divide(10, 5)

  result match {
    case Some(value) => println(s"The result is $value")
    case None => println("Cannot divide by zero")
  }
}
