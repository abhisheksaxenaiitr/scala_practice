package MethodNotations

class Person(val name: String, favouritemovie: String, val age: Int = 0) {

  def +(lover: Person): String = s"${lover.name} loves ${this.name} "
  def +(nickname: String) : Person = new Person( nickname, favouritemovie)    //method overloading
  def movie: String = s"My favourite movie is $favouritemovie"
  def apply(): String = s"Hi, I am $name and my favourite movie is $favouritemovie"
  def unary_+ : Person = new Person(name, favouritemovie, age + 10)
  def learns(thing: String) = s"$name is learning $thing"
  //def learnscala = this.learns("Scala")
  def learnscala: String = this learns "Scala"
  def apply(n: Int) : String = s"$name watched $favouritemovie $n times"


}
