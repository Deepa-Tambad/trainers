package list;

public class MainDoubleLL {

public static void main(String []args)
        {
        DoubleLL dll = new DoubleLL();
        dll.push(7);
        dll.push(1);
        dll.push(10);
        dll.push(9);
        dll.append(4);
        dll.InsertAfter(dll.head.next, 8);

        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
        }
        }