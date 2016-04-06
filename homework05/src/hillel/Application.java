package hillel;


public class Application {
    public static void main(String[] args) {
        int[] array = new int[10];
        array=ArrayUtil.fillArray(array, 100);
        ArrayUtil.printArray(array);
        System.out.println("Resulting array: ");
        ArrayUtil.printArray(Sorting.selectionSort(array));
    }
}
