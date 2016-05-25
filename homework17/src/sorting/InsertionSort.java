package sorting;

public class InsertionSort implements Sort{

    @Override
    public int[] doSort(int[] array) {
        for(int i = 0; i<array.length; i++){
            for (int j=0; j<=i; j++){
                if(array[j]>array[i]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
