package ua.od.hillel;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 2, 7};
        int[] array2 = {5, 1, 3, 2, 7};
        int[] sorted = Utils.sort(array);
        int[] insertionSorted = Utils.insertionSort(array2);
        Utils.printArray(sorted);
        Utils.printArray(insertionSorted);
    }


}
