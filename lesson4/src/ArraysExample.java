/**
 * Created by User on 31.03.2016.
 */
public class ArraysExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 34;
        array[1] = 25;
        array[2] = 81;
        array[3] = 36;
        array[4] = 64;
        int[] array2 = {5, 7, 12};
        System.out.println("size: "+array2.length);
/*
        for(int i=0;i<5;i++){1
            if(i==3) break;
            System.out.println(array[i]);
        }
*/
        for (int el : array) {
            System.out.println(el);
        }
    }

}
