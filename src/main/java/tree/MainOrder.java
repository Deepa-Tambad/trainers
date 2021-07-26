package tree;

public class MainOrder {
public static void main(String args[]){
    Order tree = new Order();
    Order.Node root = new Order.Node(5);
    System.out.println("Building tree with root value " + root.value);
    tree.insert(root, 2);
    tree.insert(root, 4);
    tree.insert(root, 8);
    tree.insert(root, 6);
    tree.insert(root, 7);
    tree.insert(root, 3);
    tree.insert(root, 9);
    System.out.println("PreOrder Traversing ");
    tree.traversePreOrder(root);
    System.out.println("\nInOrder Traversing ");
    tree.traverseInOrder(root);
    System.out.println("\nPostOrder Traversing ");
    tree.traversePostOrder(root);
}
}

