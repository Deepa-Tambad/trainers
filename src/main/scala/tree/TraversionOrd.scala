//package tree
//
// class TraversionOrd[T]() {
//  class Node( value: T) {
//
//    var left:seq[Node]= null
//
//    var right: Node = null
//     var root:Node=null
//
//    var value=null
//  }
//
//
//   def insert(node: Node[T], value: Int): Unit = {
//    var n: Node[T] = Node[T](data: T, null)
//    if (value < data.value) {
//      if (node.left != null) {
//        insert(node.left, value)
//      } else {
//        println(" Inserted " + value + " to left of " + node.value)
//        node.left = new Node(value)
//      }
//    } else if (value > node.value) {
//      if (node.right != null) {
//        insert(node.right, value)
//      } else {
//        println("  Inserted " + value + " to right of " + node.value)
//        node.right = new Node(value)
//      }
//    }
//  }
//
//  def traversePreOrder(node: Node): Unit = {
//    if (node != null) {
//      System.out.print(" " + node.value)
//      traversePreOrder(node.left)
//      traversePreOrder(node.right)
//    }
//  }
//
//  def traverseInOrder(node: Node): Unit = {
//    if (node != null) {
//      traverseInOrder(node.left)
//      System.out.print(" " + node.value)
//      traverseInOrder(node.right)
//    }
//  }
//
//  def traversePostOrder(node: Node): Unit = {
//    if (node != null) {
//      traversePostOrder(node.left)
//      traversePostOrder(node.right)
//      System.out.print(" " + node.value)
//    }
//  }
//}
//sealed case class Node[T](var data: T, var next: Node[T]) {
//  def getData: T = this.data
//  def getNext: Node[T] = this.next;
//  def printList(): Unit = {
//    print(data)
//
//    if (next != null) {
//      print(" ")
//      next.printList();
//    }
//  }
//}