package stacks;

public class Stack {
    private int[] arr;
    private int top;

    public Stack(int length) {
        arr = new int[length]; //create a stack of user-defined length
        top = -1; //initialize empty stack
        printStack();
    }

    public void push(int element) {
        if (top == arr.length - 1) //stack is full
            return;

        top++; //increase stack size
        arr[top] = element; //add the element to the top of the stack

        printStack();
    }

    public int pop() {
        if (top == -1) //empty stack
            return -1;

        int topElement = arr[top]; //get the element on the top
        top--; //remove the top element

        printStack();
        return topElement; //pop
    }

    private void printStack() {
        System.out.println("Updated stack:");
        for (int e : arr)
            System.out.print(e + ", ");
        System.out.println("\n"); //empty line
    }
}
