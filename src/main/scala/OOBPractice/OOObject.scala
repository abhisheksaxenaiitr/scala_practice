package OOBPractice


object OOObject extends App {
  val author  = new Writer("Chalrles", "Dickens", 1812)
  val novel   = new Novel("Great Expectations", 1861, author)
  val author2 = new Writer("Chalrles", "Dickens", 1812)
  val novel2  = new Novel("Rich Dad Poor Dad", 1945, author2)
  val novel3 = novel.copy(2000)

  println(novel.authorage)
  println(novel.iswrittenby(author))
  println(author==author2)
  println(s"Address for author is $author \nAddress for author2 is $author2")
  println(novel2.iswrittenby(author2))
  println(novel3.authorage)
}
