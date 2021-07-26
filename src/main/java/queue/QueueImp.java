package queue;
public class QueueImp {
        public static int cap = 4, front = 0, rear = 0;
        public static int Que[] = new int[cap];
        public static boolean isFull() {
            if (rear == cap)
                return true;
            else
                return false;
        }
        public static boolean isEmpty() {
            if (front == rear)
                return true;
            else
                return false;
        }
        public static void enQueue(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");

            } else {
                Que[rear++] = data;
            }
        }
        public static void deQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");

            } else {
                for (int i = 0; i < Que.length - 1; i++) {
                    Que[i] = Que[i + 1];
                }
                rear--;
            }
        }
        public static void traverse() {
            if (isEmpty()) {
                System.out.println("Queue is empty");

            } else {
                for (int i = front; i < rear; i++) {
                    System.out.print(Que[i] + " ");

                }
                System.out.println();
            }
        }
    }
