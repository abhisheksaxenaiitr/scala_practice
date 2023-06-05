package Enums

object MyEnums extends App {
/*  object DayOfWeek extends Enumeration {
    type DayOfWeek = Value
    val MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY = Value
  }

  val today: DayOfWeek.Value = DayOfWeek.TUESDAY
  println(s"Today is $today")*/


  type name = String

  def student(name: name) = s"Student's name is ${name}"

  println(student("Abhishek Saxena"))
}

