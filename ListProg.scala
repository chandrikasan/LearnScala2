
object ListProg {
  def main(args: Array[String]): Unit = {
    val listOfFruits:List[String] = List("Orange", "Apple","Mango")

    println(listOfFruits)

    for ( fruit <- listOfFruits)
      println(fruit)

    println(listOfFruits.isEmpty)

    println(listOfFruits.length)

    println(listOfFruits.contains("Orange"))
    println(listOfFruits.contains("Kiwi"))
    println(listOfFruits.reverse)


    var xlist = listOfFruits ++ List("Banana")

    println(xlist)



    xlist = "Kiwi" :: listOfFruits
    println(xlist)
    xlist = xlist :+ "Pineapple"

    println(xlist)

   xlist.foreach(fruit => { println (s"Fruit Name: $fruit" +  fruit)})
    //println(listOfFruits)

  }
}
