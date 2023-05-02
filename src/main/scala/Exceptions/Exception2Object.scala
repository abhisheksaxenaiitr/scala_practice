package Exceptions
//Shortened Code
object Exception2Object extends  App {
  val divide  = (x:Int, y:Int) => if(y==0) throw new RuntimeException("Divisor Cannot Be 0") else x/y

  try {
    val check = divide(10, 5)
    println (s"Result: $check")
  }

  catch {
    case ex: RuntimeException => println(s"Exception Caught: ${ex.getMessage}")
  }

  finally println("This is finally block")
}