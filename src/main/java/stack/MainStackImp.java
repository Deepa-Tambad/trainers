package stack;

public class MainStackImp {
    public static void main(String args[]) {
        StackImp stk = new StackImp();
        stk.push(12);
        stk.push(13);
        stk.push(14);
        stk.traversing();
        stk.pop();
        stk.traversing();
        stk.pop();
        stk.traversing();
        stk.pop();
        stk.traversing();
        stk.pop();
    }
}
