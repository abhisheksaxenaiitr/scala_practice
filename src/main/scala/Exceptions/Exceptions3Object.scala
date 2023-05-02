package Exceptions

object Exceptions3Object extends App {
  def divide(x: Int, y: Int): Unit = try {
    if (y == 0) throw new RuntimeException("Divisor Can't Be Negative")
    println(x / y)
  } catch {
    case ex: RuntimeException => println(s"Caught Error: ${ex.getMessage}")
  } finally {
    println("Bye Bye")
  }

  divide(10,0)
  println("..................")
  divide(100,40)

}
