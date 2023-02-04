package queues;

import utils.Logger;

public class Queue {
    private int[] arr;
    private int front, rear;
    private Logger logger;

    public Queue(int length) {
        arr = new int[length];
        front = rear = -1; //empty queue
        logger = new Logger(arr);
        logger.print();
    }

    public void addToRear(int element) {
        //the queue is full
        if (rear == arr.length - 1)
            return;

        //empty queue
        if (front == -1) {
            front = rear = 0;
            arr[0] = element;
            return;
        }

        //normal queue
        rear++;
        arr[rear] = element;

        logger.print();
    }

    public int deleteFromFront() {
        //empty queue
        if (front == -1) {
            logger.log("Empty queue");
            return -1;
        }

        //one element queue
        if (front == rear) {
            //so empty the queue and return the only element
            int element = arr[rear];
            front = -1;
            rear = -1;
            return element;
        }

        //normal size queue
        int element = arr[front];
        front++;
        logger.print();
        return element;
    }
}
