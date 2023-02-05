package algorithms.sorting;

import utils.Logger;

public class Sort {

    public static void main(String[] args) {
        selectionSort(new int[] {32,32,543,534,5,43,6,35,43,45,3});
    }

    public static void selectionSort(int[] array) {
        int temp, minValueIndex;

        //loop all value except the last one
        for (int i = 0; i < array.length - 1; i++) {
            minValueIndex = i; //assume min value to be the currently iterating one
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[minValueIndex])
                    minValueIndex = j; //reassign min value if it's smaller than the assumed one

            //swap the iterating value and the smallest value
            temp = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = temp;
        }

        new Logger(array).print();
    }

}
