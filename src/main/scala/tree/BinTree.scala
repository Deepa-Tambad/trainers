package tree
sealed case class Node[T](var data: T, var next: Node[T]) {
  def getData: T = this.data
  def printList(): Unit = {
    print(data)
    if (next != null) {
      print(" ")
      next.printList();
    }
  }
}
class BinTree[T] {
  class Node[T](var key: Int) {
    var root:Node[T] = null
    var left= null
    var right= null

  }
    /*------INSERTION-----------*/
    def insertion(node:T):Unit={
        // add an element
        // duplicate nodes linked to the right
        if (node == null) return

        if (node.value < value){
          if (left == null)
            left = node
          else{
            this.left.insertion(node)
          }
        } else{
          if (this.right == null) this.right = node
          else this.right.insertion(node)
        }

      }
 /* def insertion(key: Int): Int = {
    root = insert_Recursive(root, key)
  }

  def insert_Recursive(root: Node[T], key: Int): Unit = {
    if (root == null) {
      root = new Node[Int](key)
     root
    }
    if (key < root.key)
      root.left = insert_Recursive(root.left, key)
    else
      if (key > root.key) root.right = insert_Recursive(root.right, key)
    root
  }*/

  /*------DELETION-------------*/
//
//  def deletionKey(key: Int): Unit = {
//    root = delete_Recursive(root, key)
//    println(key + " is Deleted in Tree")
//  }
//
//  def delete_Recursive(root: Node[T], key: Int): Node[T] = {
//    if (root == null) root
//    if (//traverse left subtree
//      key < root.key) root.left = delete_Recursive(root.left, key)
//    else if (//traverse right subtree
//      key > root.key) root.right = delete_Recursive(root.right, key)
//    else {
//      if (root.left == null) root.right else if (root.right == null) root.left
//      root.key = minValue(root.right)
//      root.right = delete_Recursive(root.right, root.key)
//    }
//    root
//  }

// def minValue(root: Node[T]): Int = {
//    var minval: Int = root.key
//    while (root.left != null) {
//      minval = root.left.key
//      root = root.left
//    }
//    minval
//  }
////  /*-----------------SEARCHING--------------*/
//
//  def searching(key: Int): Boolean = {
//    root = search_Recursive(root, key)
//    if (root != null) true else false
//  }

//  def search_Recursive(root: Node[T], key: Int): Node[T] = {
//    if (root == null || root.key == key) root
//    if (root.key > key)
//      search_Recursive(root.left, key)
//    search_Recursive(root.right, key)
  }

//  def inorder(): Unit = {
//    println("Inorder Traversing:")
//    inorder_Recursive(root)
//  }
//
//  def inorder_Recursive(root: Node[T]): Unit = {
//    if (root != null) {
//      inorder_Recursive(root.left)
//      System.out.print(root.key + " ")
//      inorder_Recursive(root.right)
//    }
//  }
}