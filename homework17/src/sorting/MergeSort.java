package sorting;

import java.util.Arrays;

public class MergeSort implements Sort{
    @Override
    public int[] doSort(int[] array) {
        if(array.length<2) return array;
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int[] left = Arrays.copyOf(array, leftSize);
        int[] right = Arrays.copyOfRange(array, leftSize,  array.length);
        left = doSort(left);
        right = doSort(right);
        array = merge(left, right);
        return array;
    }

    public static int[] merge(int[] left, int[] right){
        int[] array = new int[left.length+right.length];
        int i =0, j=0, z =0;
        while(i<left.length && j<right.length){
            if(left[i]<= right[j]){
                array[z] = left[i];
                i++;
                z++;
            } else {
                array[z]= right[j];
                j++;
                z++;
            }
        }
        while(z<array.length){
            if(j<right.length){
                array[z] = right[j];
                j++;
                z++;
            } else {
                array[z] = left[i];
                i++;
                z++;
            }
        }
        return array;
    }
}
