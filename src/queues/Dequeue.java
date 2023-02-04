package queues;

import utils.Logger;

public class Dequeue {
    private int[] arr;
    private int front, rear;
    private Logger logger;

    public Dequeue(int length) {
        arr = new int[length];
        front = rear = -1; //empty queue
        logger = new Logger(arr);
        logger.print();
    }

    public void addRear(int element) {
        if (front == -1) { //empty queue
            front = rear = 0;
            arr[0] = element;
        } else if (rear != arr.length - 1) { //rear is not full
            rear++;
            arr[rear] = element;
        }

        logger.print();
    }

    public void addFront(int element) {
        if (front == -1) { //empty queue
            front = rear = 0;
            arr[0] = element;
        } else if (front != 0) { //rear is not full
            front--;
            arr[front] = element;
        }

        logger.print();
    }

    public int deleteFront() {
        //empty queue
        if (front == -1) {
            logger.log("Empty queue");
            return -1;
        }

        //one element queue
        if (front == rear) {
            //so empty the queue and return the only element
            int element = arr[front];
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

    public int deleteRear() {
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
        int element = arr[rear];
        rear--;
        logger.print();
        return element;
    }

}
