
package hillel;

import java.util.Random;

public class ArrayUtil {
    public static int[] fillArray(int[] array, int max){
        for(int i=0; i<array.length; i++){
            array[i]=randomInt(max);
        }
        return array;
    }

    public static void printArray(int[] array){

        for(int element: array){
            System.out.print(element+" ");
        }
        System.out.println("\n");
    }

    private static int randomInt(int num){
        Random random = new Random();
        return random.nextInt(num);
    }
}
