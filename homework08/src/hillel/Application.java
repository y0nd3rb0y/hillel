package hillel;

public class Application {
    public static void main(String[] args) {
        System.out.println("\n1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:\n" +
                "@ заменяется на [ at ]\n" +
                ". заменяется на [ dot ]\n");
        String email = "m.samonov@gmail.com";
        System.out.print(email+" == ");
        System.out.println(email.replace(".", "[dot]").replace("@","[at]"));


        System.out.println("\n2. i18n используется для обозначения слова internationalization, где 18 означает количество букв между первой и последней в этом слове.\n" +
                "Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму. Слова длиной меньше 4х оставить без изменений.\n");
        String numeronyms = "internationalization localization cat elephant monitor";
        String[] longWordsArray = numeronyms.split(" ");
        System.out.println(numeronyms);
        for(String word:longWordsArray){
            numeronymize(word);
        }

        System.out.println("\n3. Определить является ли слово палиндромом");
        String palyndromes = "deleveled, evitative, cat, dog, deified\n";
        System.out.println(palyndromes);
        String[] palyndromesArray = palyndromes.split(",");
        int counter =0;
        for(String word:palyndromesArray){
            if(checkPalyndrome(word.trim())){
                counter++;
            }
        }

        System.out.println("There are "+counter+" palyndromes");

        System.out.println("\n4. Напишите перевод из 10ной системы счисления в 2ную с помощью рекурсии.\n");
        int n = 123;
        System.out.println("convertBase10ToBase2("+n+"): "+convertBase10ToBase2(n));
        System.out.println("Integer.toBinaryString() : "+Integer.toBinaryString(n));

    }

    private static void numeronymize(String word){
        if(word.length()>3) {
            int midLength = word.length()-2;
            System.out.print(String.valueOf(word.charAt(0))+midLength+String.valueOf(word.charAt(word.length()-1))+" ");
        } else {
            System.out.print(word+" ");
        }
    }

    private static boolean checkPalyndrome(String word){
        int i =0;
        int j = word.length()-1;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    private static String convertBase10ToBase2(int n){
        String binary = String.valueOf(n%2);
        if(n>1){
            n/=2;
            binary = (convertBase10ToBase2(n))+binary;
        }
        return binary;
    }
}
