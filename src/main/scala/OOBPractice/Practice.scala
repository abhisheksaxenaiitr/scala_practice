package OOBPractice


class Writer(firstname: String, surname: String, val year: Int){
  def fullname: String = firstname + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorage: Int = year - author.year
  def iswrittenby(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}

