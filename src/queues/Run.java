package queues;

public class Run {
    public static void main(String[] args) {
        runCircularQueue();
    }

    public static void runQueue() {
        Queue queue = new Queue(4);
        queue.deleteFromFront();
        queue.deleteFromFront();
        queue.addToRear(9);
        queue.addToRear(10);
        queue.addToRear(11);
        queue.deleteFromFront();
        queue.addToRear(12);
        queue.deleteFromFront();
        queue.addToRear(13);
    }

    public static void runDequeue() {
        Dequeue dequeue = new Dequeue(4);
        dequeue.addFront(1);
        dequeue.addRear(4);
        dequeue.deleteFront();
        dequeue.deleteRear();
        dequeue.addFront(2);
        dequeue.addRear(3);
        dequeue.addRear(5);
        dequeue.addFront(6);
    }

    public static void runCircularQueue() {
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.addRear(1);
        circularQueue.addRear(2);
        circularQueue.addRear(3);
        circularQueue.addRear(4);
        circularQueue.deleteFront();
    }
}
