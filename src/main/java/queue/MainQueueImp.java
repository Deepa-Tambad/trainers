package queue;

public class MainQueueImp {
    public static void main(String args[]){
        //QueueImp s=new QueueImp();
        QueueImp.enQueue(10);
        QueueImp.enQueue(20);
        QueueImp.enQueue(30);

        QueueImp.traverse();
        QueueImp.deQueue();
        QueueImp.traverse();
        QueueImp.deQueue();
        QueueImp.traverse();
        QueueImp.deQueue();


    }
}
