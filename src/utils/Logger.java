package utils;

public class Logger {
    private int[] array;

    public Logger(int[] array) {
        this.array = array;
    }

    public void print() {
        System.out.println("Updated array:");
        for (int e : array)
            System.out.print(e + ", ");
        System.out.println("\n"); //empty line
    }

    public void log(String message) {
        System.out.println(message);
        System.out.print("Last state: ");
        print();
    }
}
