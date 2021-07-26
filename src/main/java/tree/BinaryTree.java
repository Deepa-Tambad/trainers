package tree;

class BinaryTree {
    class Node {
        int key;
        Node left, right;

        public Node(int data){
            key = data;
            left = right = null;
        }
    }
    Node root;

    BinaryTree(){
        root = null;
    }
    /*------INSERTION-----------*/
    void insertion(int key)  {
        root = insert_Recursive(root, key);
    }
    Node insert_Recursive(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key);
        return root;
    }
    /*------DELETION-------------*/
    void deletionKey(int key) {
        root = delete_Recursive(root, key);
        System.out.println(key+ " is Deleted in Tree");
    }
    Node delete_Recursive(Node root, int key)  {
        if (root == null)
            return root;
        if (key < root.key)     //traverse left subtree
            root.left = delete_Recursive(root.left, key);
        else if (key > root.key)  //traverse right subtree
            root.right = delete_Recursive(root.right, key);
        else  {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);
            root.right = delete_Recursive(root.right, root.key);
        }
        return root;
    }
    int minValue(Node root)  {
        int minval = root.key;
        while (root.left != null)  {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    /*-----------------SEARCHING--------------*/
    boolean searching(int key)  {
        root = search_Recursive(root, key);
        if (root!= null)
            return true;
        else
            return false;
    }
    Node search_Recursive(Node root, int key)  {
        if (root==null || root.key==key)
            return root;
        if (root.key > key)
            return search_Recursive(root.left, key);
        return search_Recursive(root.right, key);
    }
    /*---------------TRAVERSING---------------*/

    void inorder() {
        System.out.println("Inorder Traversing:");
        inorder_Recursive(root);
    }
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }
}
