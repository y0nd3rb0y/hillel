import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….\n");

        int a = 1000;
        while(a<10000){
            System.out.print(a+" ");
            a=a+3;
        }

        System.out.println("\n2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….\n");
         a = 1;
        for(int i=0;i<55; i++){
            System.out.print(a+" ");
            a+=2;
        }

        System.out.println("\n3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….\n");
        a=90;
        while(a>=0){
            System.out.print(a+" ");
            a=a-5;
        }

        System.out.println("\n4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….\n");
        a=2;
        for(int i=0;i<20;i++){
            System.out.print(a+" ");
            a*=2;
        }

        System.out.println("\n5. Найти сумму первых n элементов массива\n");
        int[] array = new int[30];
        System.out.print("Array contains: ");
        for(int i=0;i<array.length; i++){
            array[i] = randomInt(100);
            System.out.print(array[i]+" ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number of elements to sum: ");
        //int n = scanner.nextInt();
        int n = 5;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum+=array[i];
        }
        System.out.println(n+" array elements sum is: "+sum);

        System.out.println("\n6. Найти минимальный и максимальный элемент массива\n");
        int min=array[0];
        int max=array[0];
        for (int element:array){
            if(element<=min) min=element;
            if(element>=max) max=element;
        }
        System.out.println("Mininal array element is: "+min);
        System.out.println("Maximal array element is: "+max);

        System.out.println("\n7. Найти сумму всех четных и сумму всех нечетных элементов массива\n");
        int odd_sum=0;
        int even_sum=0;
        for(int element:array){
            if(element%2==0){
                even_sum+=element;
            } else {
                odd_sum+=element;
            }
        }
        System.out.println("Sum of even elements: "+even_sum);
        System.out.println("Sum of odd element: "+odd_sum);

        System.out.println("10. Вывести первые 5 минимальных элементов массива\n");

        System.out.println("Minimal elements of array: ");
        min=array[0];
        int min_index=0;
        int[] result = new int[6];
        for(int i=0;i<=5;i++){
            min=array[i];
            for(int j=0+i;j<array.length;j++){

                if(array[j]<min) {
                    min=array[j];
                    min_index=j;
                }
            }

            int temp = array[i];
            array[i]=array[min_index];
            array[min_index]=temp;
            System.out.print(array[i]+" ");

        }
        int[] sortedArray = array;
        Arrays.sort(sortedArray);
        System.out.println("\nSorted array to compare: ");

        for(int element:sortedArray){
            System.out.print(element+" ");
        }

        System.out.println("\n8. Найти все счастливые билеты от 100000 до 999999\n");
        int[] tickets = new int[50412];
        int counter =0;
        for(int ticket=100000;ticket<999999;ticket++){

            int right = ticket%1000;
            int left = (ticket)/1000;
            int sum_left = sumDigits(left);
            int sum_right = sumDigits(right);
            if(sum_left==sum_right){
                counter++;
                tickets[counter]=ticket;
            }
        }

        System.out.println("Ticket "+tickets[randomInt(tickets.length)]+" is your lucky ticket out of "+tickets.length+" tickets");

        System.out.println("\n9. Перевести число в двоичную систему счисления\n");
        System.out.print("Enter decimal number: ");
        int number = scanner.nextInt();
        System.out.println("Binary: "+convertIntToBin(number));

    }

    private static int randomInt(int num){
        Random random = new Random();
        return random.nextInt(num);
    }

    private static int sumDigits(int number){
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number = number / 10;
        }
        return sum;
    }

    private static String convertIntToBin(int number){
        StringBuilder builder = new StringBuilder();
        while(number!=0){
            builder.append(number%2);
            number/=2;
        }
        return builder.reverse().toString();
    }
}
