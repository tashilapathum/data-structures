package stacks;

import utils.Logger;

public class Stack {
    private final int[] arr;
    private int top;
    private Logger logger;

    public Stack(int length) {
        arr = new int[length]; //create a stack of user-defined length
        top = -1; //initialize empty stack
        logger = new Logger(arr);
        logger.print();
    }

    public void push(int element) {
        if (top == arr.length - 1) //stack is full
            return;

        top++; //increase stack size
        arr[top] = element; //add the element to the top of the stack

        logger.print();
    }

    public int pop() {
        if (top == -1) //empty stack
            return -1;

        int topElement = arr[top]; //get the element on the top
        top--; //remove the top element

        logger.print();
        return topElement; //pop
    }
}
