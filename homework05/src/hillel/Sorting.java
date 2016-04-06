package hillel;

import java.util.Arrays;

public class Sorting {

    public static int[] mergeSort(int[] array) {
        int lLength = array.length / 2;
        int rLength = array.length - lLength;
        int[] left =int[lLength];
        int[] right =int[rLength];
        for (int i = 0; i < lLength; i++) {
            left[i] = array[i]
        }
        for (int i = lLength; i < array.length; i++) {
            right[i] = array[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        array = merge(left, right);
        return array;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result;
        while( left.length>0 && right.length>0){
            if(left[0]<=right[0]){
                result
                left= Arrays.copyOfRange(left, left[1], left[left.length-1]);
            }
        }
    }

    public static int[] insertionSort(int[] array) {
        return array;
    }

    public static int[] selectionSort(int[] array) {
        int operations = 0;
        long timeStart = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                operations++;
            }
        }
        long timeEnd = System.nanoTime();
        System.out.println("selection sort execution time: " + (timeEnd - timeStart) + " ms. Operations: " + operations);
        return array;
    }

}
