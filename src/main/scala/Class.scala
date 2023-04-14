import java.io.Writer
import scala.annotation.tailrec
import scala.jdk.Accumulator

/*class My_Class{

  def sum(x: Int): Int = {
    @tailrec
    def calc_add(n: Int, accumulator: Int): Int= {
      if(!(n==0)) calc_add(n-1, accumulator + n) else accumulator
    }

    calc_add(x,0)
  }


  def isPrime(n: Int): Boolean= {
    @tailrec
    def check(x: Int, accumulator: Boolean) : Boolean= {
      if (x<2) true
      else (check(x-1, n%(x-1)==0))
    }

    check(n, true)
  }


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean = { // does n have any divisors until t
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)

}*/

class Writer(firstname: String, surname: String, val year: Int) {
  def fullname: String = firstname + " " + surname
}

class Novel(name: String, var year: Int, author: Writer){
  def authorAge: Int = year - author.year
  def isWrittenBy(x: Writer) = x == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  def update(year: Int): Unit = this.year = year
}


