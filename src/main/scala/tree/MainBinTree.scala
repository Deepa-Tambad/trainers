package tree

object MainBinTree {
  def main(args: Array[String]): Unit = {
    val bst = new BinTree[Int]()
    bst.insertion(45)
    bst.insertion(10)
    bst.insertion(7)
    bst.insertion(12)
    bst.insertion(90)
    bst.insertion(50)
   // bst.inorder()
//    bst.deletionKey(12)
//    bst.inorder()
//    var ret_val: Boolean = bst.searching(50)
//    println("\nKey found in BST:" + ret_val)

  }
}
