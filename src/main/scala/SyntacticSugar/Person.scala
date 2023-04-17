package SyntacticSugar

class Person(val name: String, favouritemovie: String){
  def likes(movie: String): Boolean = movie== favouritemovie
  def hangoutwith(person:Person):String = s"${this.name} is hanging out with ${person.name}"
  def +(lover: Person): String = s"${lover.name} loves ${this.name} "
  def unary_! = s"$name is a good human being"
  def unary_~ = s"${name} is a nice person"
  def movie : String = s"My favourite movie is $favouritemovie"
  def copy(name: String): Person = new Person(name, favouritemovie)
  def apply() : String = s"Hi, I am $name and my favourite movie is $favouritemovie"
}

