package OOBasics

class Person(name: String, val age: Int){
  val sex = "Male"
  def greetings(name: String): Unit = println(s"${this.name} says: How are you $name?")
  def greetings(): Unit = println(s"${this.name} says: How are you $name?")

  /*def this(name: String) = this(name, 0)      //AUXILIARY CONSTRUCTOR
  def this() = this("Roy")*/                    //AUXILIARY CONSTRUCTOR
}

