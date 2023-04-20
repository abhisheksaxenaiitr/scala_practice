package CaseClasses

case class Person(name: String, age: Int) {

}

abstract class Animal{
  def size: Int = 50
  def category: String
  val age = 10
}

trait Specie extends Animal {
  def colour: String = "White"
  val healthstatus: String
  override def size: Int = 10 + super.size
}

class Dog extends Specie {
  override def size: Int = super.size + 100
  override val healthstatus: String = "Fit"
  override def category: String = "Pet"
}