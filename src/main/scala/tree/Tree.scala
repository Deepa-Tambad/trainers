package tree
class tree {
  class TreeNode(key: Int) {
    var left: TreeNode = null
    var right: TreeNode = null
  }

  var root: TreeNode = null

  def insertion(node: TreeNode, key: Int) {
    if (key < node.key) {
      if (node.left != null)
        insertion(node.left, key)
      else {
        println(key + " is inserted to left of" + node.key)
        node.left = new TreeNode(key)
      }
    } else if (key > node.key) {
      if (node.right != null)
        insertion(node.right, key)
    } else {
      println(key + " is inserted to left of" + node.key)
      node.right = new TreeNode(key)
    }

    def search_Recursive(root: Node[T], key: Int): Node[T] = {
         if (root == null || root.key == key) root
          if (root.key > key)
            search_Recursive(root.left, key)
          search_Recursive(root.right, key)
    }

    def preOrder(node: TreeNode): Unit = {
      if (node != null) {
        System.out.print(" " + node.key)
        preOrder(node.left)
        preOrder(node.right)
      }
    }

    def inOrder(node: TreeNode): Unit = {
      if (node != null) {
        inOrder(node.left)
        System.out.print(" " + node.value)
        inOrder(node.right)
      }
    }

    def postOrder(node: TreeNode): Unit = {
      if (node != null) {
        postOrder(node.left)
        postOrder(node.right)
        System.out.print(" " + node.key)
      }
    }

  }

}