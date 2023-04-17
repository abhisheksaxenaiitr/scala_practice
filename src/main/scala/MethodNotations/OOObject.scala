package MethodNotations

import scala.language.postfixOps

object OOObject extends App {
  val mary = new Person("Mary", "Devdas", 25)
  val tom  = new Person("Tom", "Kal Ho Na Ho")
  val roy  = new Person("Roy", "Ishaqzade")


  println(roy.apply())                //Apply Method
  println((mary + "Rockstar")())      //(mary + "Rockstar") = Object
  println((+mary).age)
  println(mary learnscala)
  println(mary(10))

}
