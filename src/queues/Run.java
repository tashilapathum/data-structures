package queues;

public class Run {
    public static void main(String[] args) {
        runQueue();
    }

    public static void runQueue() {
        Queue queue = new Queue(4);
        queue.deleteFromFront();
        queue.deleteFromFront();
        queue.addToRear(9);
        queue.addToRear(10);
        queue.addToRear(11);
        queue.deleteFromFront();
        queue.deleteFromFront();
    }
}
