package tree;

public class MainBinaryTree {
    public static void main(String args[]) {
        BinaryTree bst = new BinaryTree();

        bst.insertion(45);
        bst.insertion(10);
        bst.insertion(7);
        bst.insertion(12);
        bst.insertion(90);
        bst.insertion(50);

        bst.inorder();
        bst.deletionKey(12);
        bst.inorder();
        boolean ret_val = bst.searching(50);
        System.out.println("\nKey 50 found in BST:" + ret_val);
        ret_val = bst.searching(12);
        System.out.println("\nKey 12 found in BST:" + ret_val);
    }

}