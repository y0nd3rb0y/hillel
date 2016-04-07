package hillel;

/**
 * Created by User on 07.04.2016.
 */
public class SumOfElements {
    public static void main(String[] args) {
        int[] array = {1,3,9,12,15};
        getElements(array);
    }
    public static void getElements(int[] array){
        int i=0;
        int j=array.length-1;
        int sum = 15;
        while (i<j) {
            if (array[i]+array[j]<sum){
                i++;
            } else if (array[i]+array[j]>sum) {
                j--;
            } else {
                System.out.println("Elements: " + array[i] + "+" + array[j]);
                break;
            }
        }
    }
}
