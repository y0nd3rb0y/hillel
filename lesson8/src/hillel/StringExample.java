package hillel;

/**
 * Created by User on 14.04.2016.
 */
public class StringExample {
    public static void main(String[] args) {
        String str = "Hello";
        str += " ";
        str += "world";
        String str2 = "Hello world";
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str);

        String str3 = str2.intern();
        System.out.println(str3);
        String str4 = str3.intern();
        System.out.println(str3==str4);
        str2 += "123";
        System.out.println(str3);
        str3 += "345";
        System.out.println(str4);
    }
}
