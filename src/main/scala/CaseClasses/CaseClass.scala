package CaseClasses

object CaseClass extends App {


  trait Polygon
  case class Circle(radius: Int) extends Polygon
  case class Rectangle(length: Int, breadth: Int) extends Polygon
  case class Square(side: Int) extends Polygon

  val circle = Circle(4)
  val rectangle = Rectangle(7,5)
  val square = Square(3)


  def FindArea(x: Polygon) = x match {
    case Circle(radius) => 3.1427*radius*radius
    case Rectangle(length, breadth) => length*breadth
    case Square(side) => side*side
  }

  println(FindArea(Circle(5)))
  println(FindArea(circle))

  /*  sealed trait Shape
    case class Circle(radius: Double) extends Shape
    case class Rectangle(width: Double, height: Double) extends Shape
    case class Square(sideLength: Double) extends Shape

    val circle = Circle(5.0)
    val rectangle = Rectangle(3.0, 4.0)
    val square = Square(6.0)

    def calculateArea(shape: Shape): Double = shape match {
      case Circle(radius) => Math.PI * Math.pow(radius, 2)
      case Rectangle(width, height) => width * height
      case Square(sideLength) => Math.pow(sideLength, 2)
    }

    println(calculateArea(circle))*/

}
