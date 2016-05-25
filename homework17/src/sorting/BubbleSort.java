package sorting;

public class BubbleSort implements Sort {
    private int[] array;
    private int[] result;

    public int[] doSort(int[] array){

        boolean sorted  = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                int temp=0;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
