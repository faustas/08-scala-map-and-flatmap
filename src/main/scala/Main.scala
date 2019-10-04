object Main {

  def main(args: Array[String]): Unit = {

    val numL = List(1, 2, 3, 4)
    val numL2 = List(5, 6, 7, 8)

    /**
     * MAP
     */

    // define the function
    val r = numL.map(n => n + 1)

    println(r)  // List(1, 2, 3, 4) -> List(2, 3, 4, 5)

    // pass a function

    def addOne(n: Int) = n + 1

    val r2 = numL.map(addOne)

    println(r2) // List(1, 2, 3, 4) -> List(2, 3, 4, 5)

    /**
     * FLATMAP
     */

    // nested lists will be traversed and the result merged
    val r3 = List(numL, numL2).flatMap(n => n.map( i => i + 1))

    println(r3) // List(1, 2, 3, 4, 5, 6, 7, 8) -> List(2, 3, 4, 5, 6, 7, 8, 9)

    // flattening optional values that are not defined
    val optionalList = List(1, 9, 2, 8, 3, 7, 4, 6, 5)

    // all numbers bigger for are `None`
    val r4 = optionalList.flatMap(e => if (e < 5) Option(e) else None)

    println(r4) // List(1, 9, 2, 8, 3, 7, 4, 6, 5) -> List(1, 2, 3, 4)

  }

}
