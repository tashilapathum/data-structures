package queues;

import utils.Logger;

public class CircularQueue {
    private int[] arr;
    private int front, rear;
    private Logger logger;

    public CircularQueue(int length) {
        arr = new int[length];
        front = rear = -1; //empty queue
        logger = new Logger(arr);
        logger.print();
    }

    public void addRear(int element) {
        //full queue
        if ((rear - front == arr.length - 1) || (front - rear == 1)) {
            logger.log("Queue full");
            return;
        }

        //empty queue
        if (front == -1) {
            front = rear = 0;
            arr[0] = element;
            logger.print();
            return;
        }

        //normal queue
        rear = (++rear) % arr.length;
        arr[rear] = element;
        logger.print();
    }

    public int deleteFront() {
        //empty queue
        if (front == -1) {
            logger.log("Queue empty");
            return -1;
        }

        //last element
        if (front == rear) {
            int element = arr[rear];
            front = rear = -1;
            logger.print();
            return element;
        }

        //normal case
        int element = arr[front];
        front = (++front) % (arr.length - 1);
        logger.print();
        return element;
    }

}
