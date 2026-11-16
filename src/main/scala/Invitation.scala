package Uebungen

case class person[U](value: U)

object Invitation {
  def main(args: Array[String]): Unit = {
    val person1: person[String] = person("Student")
    val person2: person[String] = person("Professor")
    val person3: person[Int] = person(1)
    val listofpeople = List(person1, person2, person3)

    for (personen <- listofpeople) {
      personen match {
        case person(value) if value == "Student" => println("Du bist hiermit zu unserer Abshclussfeier am xx.xx.xxxx eingeladen")
        case person(value) if value == "Professor" => println("Sie sind hiermit zu unserer Abshclussfeier am xx.xx.xxxx eingeladen")
        case _ => println("N/A")
      }
    }

  }
}