package LazyEvaluation

object LazyObject extends App {
  lazy val myLazyValue: Int = {
    println("Computing myLazyValue")
    42
  }

  println("Before accessing myLazyValue")
  println(myLazyValue)
  println("After accessing myLazyValue")
  println(myLazyValue)


  /*val a = {
    println("Hi")
    5
  }

  println(a)
  println("Afterwards")
  println(a)*/

/*  def printValue(n: => Int): Unit = {
    println("Before accessing value")
    println(n)
    println("After accessing value")
  }

  printValue({
    println("Computing value")
    42
  })*/



}
