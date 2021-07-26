package stack;

class StackImp
{
    static final int MAX = 1000;
    int stack[]=new int[MAX];
    int size = 100, top = -1;

    public void push(int val) {
        if (top >= size - 1)
            System.out.println("Overflow: Stack is full");
        else {
            top++;
            stack[top] = val;
        }
    }

    public void pop() {
        if (top <= -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("\nElement popped  = " + stack[top]);
            top--;
        }
    }
    public void traversing() {
        int i = 0;
        if (top >= 0) {
            System.out.println("Stack Elements are  ");
            for (i = 0; i <= top; i++)
                System.out.print(stack[i] + "  ");
        } else {
            System.out.println("Stack is Empty");
        }
    }
}