package sorting;

import java.util.Arrays;

public class QuickSort implements Sort {
    @Override
    public int[] doSort(int[] array) {
        int pivotPosition = array.length-1;
        int i =0;
        int j =array.length-2;

        while(i<array.length-1 && j>0){
            if(array[i]>array[j]) {
                int tempSwap = array[j];
                array[j] = array[i];
                array[i] = tempSwap;
                i++;
            }
            if (array[j] > array[pivotPosition]) {
                int tempPivot = array[pivotPosition];
                array[pivotPosition] = array[j];
                array[j] = tempPivot;
                pivotPosition = j;
                j--;
            }
        }
        int[] left = Arrays.copyOf(array, pivotPosition);
        int[] right = Arrays.copyOfRange(array, pivotPosition+1, array.length);
        left = doSort(left);
        right = doSort(right);
        int z =0;
        for(int element : left){
            array[z] = element;
            z++;
        }
        array[z] = array[pivotPosition];
        z++;
        for(int element : right){
            array[z] = element;
            z++;
        }
        return array;
    }
}
