package algorithms.searching;

public class Search {

    public static void main(String[] args) {
        System.out.println(binarySearch(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                4,
                0,
                10
        ));
    }

    public static int binarySearch(int[] array, int x, int start, int end) {
        int mid = (start + end) / 2;

        //the finding element is right in the middle
        if (array[mid] == x)
            return mid;

        //array is empty
        if (start == end)
            return -1;

        //element is in the first half
        if (array[mid] > x)
            return binarySearch(array, x, start, mid - 1);

        //element is in the second half
        if (array[mid] < x)
            return binarySearch(array, x, mid + 1, end);

        return -2;
    }

}
