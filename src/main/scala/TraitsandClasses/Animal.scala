package TraitsandClasses

abstract class Animal {
  val creaturetype: String
  def eat: Unit
}

class Dog(name: String) extends Animal{
  val creaturetype: String = "Domestic Animal"  //overriding but oveeride keyword not needed!
  def eat: Unit = println("Crunch Crunch")      //overriding but oveeride keyword not needed!
  def petname = name
}


trait A
{
  def name: String
}

trait B extends A
{
  override def name: String ="class b"
}

trait C extends A
{
  override def name: String ="class c"
}

class D extends C with B
{
  override def name: String = super.name
}


