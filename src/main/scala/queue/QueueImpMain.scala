package queue

object QueueImpMain extends App {

    var que=new QueueImplementation[Int]()
    que.enQueue(1)
    que.enQueue(11)
    que.enQueue(12)
    que.traverseQue()
    que.deQueue()
    que.traverseQue()
    que.deQueue()



}
