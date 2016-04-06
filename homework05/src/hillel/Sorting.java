package hillel;


public class Sorting {

    public static int mergeOps = 0;

    public static int[] measureMergeSort(int[] array){
        long timeStart = System.nanoTime();
        array = mergeSort(array);
        long timeEnd = System.nanoTime();
        System.out.println("Merge sort execution time: " + (timeEnd - timeStart) + " ms. Merge operations: "+mergeOps);
        return array;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int leftLength = array.length / 2;
        int rightLength = array.length - leftLength;
        int[] left = new int[leftLength];
        int[] right = new int[rightLength];
        for (int i = 0; i < leftLength; i++) {
            left[i] = array[i];
            mergeOps++;
        }
        for (int i = leftLength; i < array.length; i++) {
            right[i - leftLength] = array[i];
            mergeOps++;
        }
        left = mergeSort(left);
        right = mergeSort(right);
        array = merge(left, right);
        return array;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int z = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[z] = left[i];
                i++;
                z++;
            } else {
                result[z] = right[j];
                j++;
                z++;
            }
            mergeOps++;
        }
        while (z<result.length) {
            if(j<right.length) {
                result[z] = right[j];
            } else {
                result[z] = left[i];
            }
            i++;
            j++;
            z++;
            mergeOps++;
        }
        return result;
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
        System.out.println("Selection sort execution time: " + (timeEnd - timeStart) + " ms. Operations: " + operations);
        return array;
    }

}
