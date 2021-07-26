package list

object Main {
  def main(args: Array[String]) {
    var list = new LinkedListImplementation[Int]();

    list.insertion( 1)
    list.insertion( 2)
    list.insertion( 3)
    list.insertion( 4)
    list.insertion( 5)
    list.insertion( 6)
    list.insertion( 7)
    list.insertion( 8)
    println("----------------")
    list.searching(1)
    list.searching(86)
    println("----------------")
    list.traversing()
    list.deletingByKey(10)
    list.deletingByKey( 5)
    list.traversing()
  }
}
