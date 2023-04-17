package ScalaObjects

object Object extends App {

  object Person {
    val name            = "Abhishek"
    def intro(age: Int) = s"My name is $name and I am $age years old!"
    def apply(mother: Person, father: Person) = new Person("Bobbie")        //Factory Method
  }

  val maya = new Person("Maya")
  val ram  = new Person("Ram")
  val sara = Person(maya, ram)


  println(Person intro 24)
  println(sara.name)
}
