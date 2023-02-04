package queues;

public class Run {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.addToRear(7);
        queue.addToRear(8);
        queue.deleteFromFront();
        queue.deleteFromFront();
        queue.addToRear(9);
        queue.addToRear(10);
        queue.addToRear(11);
    }
}
