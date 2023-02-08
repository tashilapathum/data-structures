package algorithms.sorting;

import utils.Logger;

public class Sort {

    public static void main(String[] args) {
        int[] arr = new int[]{32, 14, 23, 45, 5, 43, 6, 45, 7, 5, 8, 769, 87};
        selectionSort(arr);
        bubbleSort(arr);
        insertionSort(arr);
    }

    public static void selectionSort(int[] array) {
        int temp, minValueIndex;

        //loop all value except the last one
        for (int i = 0; i < array.length - 1; i++) {
            minValueIndex = i; //assume min value to be the currently iterating one
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[minValueIndex])
                    minValueIndex = j; //reassign min value if it's smaller than the assumed one

            //swap the iterating value and the smallest value
            temp = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = temp;
        }

        new Logger(array).print();
    }

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        new Logger(array).print();
    }

    public static void insertionSort(int[] array) {
        int key, space;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            space = i;

            for (int j = space - 1; j >= 0; j--) {
                if (array[j] > key) {
                    array[j + 1] = array[j];
                    space = j;
                    continue;
                }
                break;
            }
            array[space] = key;
        }

        new Logger(array).print();
    }

}
