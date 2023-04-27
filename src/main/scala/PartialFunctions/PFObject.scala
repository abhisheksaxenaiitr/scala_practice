package PartialFunctions



object PFObject extends App {
/*  val gradeE: PartialFunction[Int, String] = {
    case marks if marks >= 0 && marks < 30 => "E"
  }

  val gradeD: PartialFunction[Int, String] = {
    case marks if marks >= 30 && marks < 40 => "D"
  }

  val gradeC: PartialFunction[Int, String] = {
    case marks if marks >= 40 && marks < 60 => "C"
  }

  val gradeB: PartialFunction[Int, String] = {
    case marks if marks >= 60 && marks < 80 => "B"
  }

  val gradeA: PartialFunction[Int, String] = {
    case marks if marks >= 80 && marks < 100 => "A"
  }

  val marksofstudent = List(89,54,22,45)
  val gradingsystem = gradeA orElse gradeB orElse gradeC orElse gradeD orElse gradeE

  val c = marksofstudent.map(gradingsystem)
  println(c)*/

  val func1 : PartialFunction[Int, String] = {
    case marks if marks>= 30 && marks <60 =>"Poor Performance"
  }

  val func2 : PartialFunction[Int, String] = {
    case marks if marks>=60 && marks<=100 => "Good Performance"
  }

  val grading_system = func1 orElse func2
  val marksofabhi = List(45,68,96,76)

  println(marksofabhi.collect(grading_system))

}


