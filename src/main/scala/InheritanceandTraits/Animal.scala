package InheritanceandTraits

class Animal {
  protected def eat = println("momomomo")
  val creaturetype = "Wild"
}

sealed class Cat extends Animal {
  def crunch = {
    //eat
    super.eat
    println("crunch crunch")
  }

  //eat
  //println(1)
}

class Person(name: String, age: Int)
class Adult(name: String, age: Int, gender: String) extends Person(name, age)

/*class Dog extends Animal{
  override val creaturetype = "Domestic Animal"
  override def eat = println("Crunch Crunch")
}*/

// Another Way of Writing above Code
final class Dog(override val creaturetype: String = "Domestic Animal" ) extends Animal{
  override def eat = println("nom nom")
}



