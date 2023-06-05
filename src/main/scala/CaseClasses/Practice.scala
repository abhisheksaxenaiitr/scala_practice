package CaseClasses

object Practice extends App {
  case class Person(name: String, age: Int)

  val john = Person("John", 21)
  val alex = Person("Alex", 52)
  val rosy = Person("Rosy", 67)

  def Greetings(x: Person) = x match {
    case Person(name, age) if age<=35 => s"Hi ${name}, you look young"
    case Person(name, age) if age>35 && age<60 => s"Hi ${name}, age is just a number"
    case Person(name, _) => s"Hi ${name}, nice to meet you"
  }

  println(Greetings(john))
  println(Greetings(alex))
  println(Greetings(rosy))

}
