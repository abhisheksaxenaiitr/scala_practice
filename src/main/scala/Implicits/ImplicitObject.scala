package Implicits

object ImplicitObject extends App {
      val value = 10
      implicit val m = 3
      //implicit val n = 4

      def multiply(implicit y: Int) = value * y
      def add(implicit x: Int) = x + value
      def subtract(implicit a: Int) = m - a



      val result = multiply


      println(result)
      println(multiply(4))
      println(add)
      println(subtract)

    }
