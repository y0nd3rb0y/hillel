package samonov;


public class Application {
    public static int a = -13;
    public static int b = -11;
    public static int c = -2;


    public static void main(String[] args) {
        System.out.println("\n1. Найти минимальное из 3х чисел");

        int min = a;
        if (b <= min) {
            min = b;
        } else if(c <= min){
            min = c;
        }
        System.out.println("Mininal value is: "+min);

        System.out.println("\n2. Найти среди 3х чисел максимальное и минимальное");
        min = a;
        int max = a;
        if (b <= min) {
            min = b;
        }
        if(c <= min){
            min = c;
        }

        if (b >= max) {
            max = b;
        }
        if(c >= max){
            max = c;
        }
        System.out.println("Mininal value is: "+min+"\tMaximum value is: "+max);

        System.out.println("\n3. Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа");
        // ambiguous task
        min = a;
        boolean result = false;

        if (b==min && c==min){
            System.out.println("Mininal value is variables a, b and c with: "+min);
            result=true;
        } else if(min==b) {
            System.out.println("Minial value is variables a and b with: " + min);
            result=true;
        } else if(min==c) {
            System.out.println("Minial value is variables a and c with: " + min);
            result = true;
        }
        if(!result) {
            if (b <= min) {
                min = b;
            } else if (c <= min) {
                min = c;
            }
            System.out.println("Minimal value is unique: "+min);
        }



        System.out.println("\n4. Написать программу, которая проверит, является ли число четным или нечетным");
        int oddOrEven = 15;
        if(oddOrEven%2==0){
            System.out.println("Variable oddOrEven with "+oddOrEven+" is even");
        } else {
            System.out.println("Variable oddOrEven with "+oddOrEven+" is odd");
        }


        System.out.println("\n5. Даны 2 числа, определить делится ли первое число на второе без остатка");
        a = 42;
        b = 9;
        if(a%b==0){
            System.out.println("Variable a is divided by b with zero remainder");
        } else {
            System.out.println("Variable a is divided by b with non-zero remainder");
        }

        System.out.println("\n6. Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11");

        a = 11;
        b = 7;
        int ten=10;
        if((ten-a)>0){
            if((ten-b)>0){
                if((ten-a)>(ten-b)){
                    System.out.println("Variable b is closer to "+ten+" with: "+b);
                } else {
                    System.out.println("Variable a is closer to "+ten+" with: "+a);
                }
            } else {
                if ((ten - a) > (b - ten)) {
                    System.out.println("Variable b is closer to "+ten+" with: " + b);
                } else {
                    System.out.println("Variable a is closer to "+ten+" with: " + a);
                }
            }
        } else {
                if((a-ten)>(ten-b)){
                    System.out.println("Variable b is closer to "+ten+" with: "+b);
                } else {
                    System.out.println("Variable a is closer to "+ten+" with: "+a);
                }
        }

        System.out.println("\n7.Room Rental");

        int days = 5;
        int total = days * 40;

        if (days > 4)
            total -= 20;
        if (days > 7)
            total -= 30;
        System.out.println("Rent total: "+total+" for "+days+" days");
    }




}
