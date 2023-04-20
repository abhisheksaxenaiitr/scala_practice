package BasicsofFunction

object FunctionObject extends App {
//  val string_doubler = new MyFunction[String, Int] {
//    override def apply(n: String, x: Int): String = n * x
//  }
//
//  val square = new Function1[Int, Int] {
//    def apply(n: Int) = n * n
//  }
//
//  val string_concatenator = new Function2[String, String, String] {
//    def apply(str1: String, str2: String) = str1+str2
//  }
//
//  def subtract = new Function2[Int, Int, Int] {
//    def apply(v1: Int, v2: Int): Int = v1 - v2
//  }

//  def superadder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
//    override def apply(x: Int) : Function1[Int, Int] = new Function[Int, Int] {
//      override def apply(y: Int): Int = x+y
//    }
//  }

  //  println(string_doubler("Hello", 4))
  //  println(square(6))
  //  println(string_concatenator("Hello", " World"))
  //  println(subtract(3,2))



 def supperadderpro : Int => Function1[Int, Int] = new Function1[Int, Function1[Int, Int]] {
   override def apply(v1: Int): Function1[Int, Int] = new Function1[Int, Int] {
     override def apply(v2: Int): Int = v1 + v2
   }
 }


//  val adder = supperadderpro(3)
//  println(s"Method1 = ${adder(4)}")
//  println(s"Method2 = ${(supperadderpro(3))(4)}")
//  println(s"Method3 = ${supperadderpro(3)(4)}")

  println(supperadderpro)
  val xy = supperadderpro(2)
  println(xy(7))
  println(supperadderpro(3))
  println(supperadderpro(3)(4))

//  val a = supperadderpro
//  val b = a(3)
//  val c = b(4)
//  println(a, "\n", b, "\n", c)
}


