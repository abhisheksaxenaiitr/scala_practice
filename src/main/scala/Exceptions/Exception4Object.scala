package Exceptions

object Exception4Object extends App{
    val divide = (x:Int,y:Int) => try {
      if(y==0) throw new RuntimeException("Divisor Can't Be 0!")
      println(x/y)
    }

    catch {
      case ex: RuntimeException => println(s"Result: ${ex.getMessage}")
    }

    finally {
      println("This is finally block")
    }

  divide(10,0)



}
