package sorting;

public class SelectionSort implements Sort {
    @Override
    public int[] doSort(int[] array) {
        for(int i = 0; i<array.length; i++){
            for (int j=i; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
