package hillel;


public class Application {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        array1=ArrayUtil.fillArray(array1, 100);
        int[] array2 = array1.clone();
        ArrayUtil.printArray(array1);

        System.out.print("Array sorted by selection sort: ");
        ArrayUtil.printArray(Sorting.selectionSort(array1));

        System.out.print("Array sorted by merge sort: ");
        ArrayUtil.printArray(Sorting.measureMergeSort(array2));

    }
}
