package Sets

import java.util
import scala.collection.immutable.SortedSet

object SetObject extends App {
  val s = Set(1,3,5,7,9)
  println(s.tail)
  println(s.isEmpty)
  println(s"Minimum element is ${s.min}")
  println(s"Maximum element is ${s.max}")
  s.foreach(println)
  for(x<- s) {
    println(x)
  }

  val fruit1 = Set("apples", "oranges", "pears")
  val fruit2 = Set("mangoes", "banana")
  val fruit = fruit1 ++ fruit2
  println(fruit)

  val num1 = Set(5, 6, 9, 20, 30, 45)
  val num2 = Set(50, 60, 9, 20, 35, 55)
  println(s"Intersection of num1 and num2 is ${num1.intersect(num2)}")

  //SorteSet
  val ss: SortedSet[Int] = SortedSet(9,10,11,4,7)
  ss.foreach(println)

}
