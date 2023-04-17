package SyntacticSugar

import scala.language.postfixOps


object OOObject extends App {
  val mary = new Person("Mary", "Inception")
  val tom  = new Person("Tom", "Kal Ho Na Ho")
  val roy  = new Person("Roy", "Ishaqzade")
  val jai  = tom.copy("Jai")

  println(mary likes "Inception")
  println(tom hangoutwith mary)
  println(mary hangoutwith tom)
  println(mary + roy)      //Infix Notation
  println(1.+(2) == 1+2)   //Operators are Methods!
  println(mary.unary_!)
  println(!mary)
  println(~roy)            //Prefix Notation
  println(tom movie)       //Postfix Notation
  println(jai.movie)       //Immutability
  println(jai())           //Apply Method
  println(roy.apply())     //Apply Method
}

