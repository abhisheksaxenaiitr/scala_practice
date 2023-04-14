import java.lang.Class
import scala.annotation.tailrec
import scala.jdk.Accumulator
/*object Object extends App {
  val maths = new My_Class()
  //println(maths.sum(10))
  println(maths.isPrime(21))
}*/

object Object extends App{
  val author = new Writer("Charles", "Dickens", 1812)
  val novel  = new Novel("Great Expectations", 1861, author)
  val author2 = new Writer("Charles", "Dickens", 1812)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(author2))
  println(author)
  println(author2)
  val novel2 = novel.copy(1800)
  println(novel.year)
  novel.update(1996)
  println(novel.year)


}