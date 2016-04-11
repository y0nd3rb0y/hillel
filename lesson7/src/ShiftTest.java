public class ShiftTest {
    public static void main(String[] args) {
        byte number = 16;
        number = (byte) (number >> 1);
        System.out.println(number);
        number = (byte) (number >> 2);
        System.out.println(number);

        byte b1 = (byte) 13;
        b1 = (byte) (b1 >> 1);
        String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
        System.out.println(s1+" "+b1);

        byte b2 = (byte) -3;
        b2 = (byte) (b2 >> 1);
        String s2 = String.format("%8s", Integer.toBinaryString(b2 & 0xFF)).replace(' ', '0');
        System.out.println(s2+" "+b2);
    }
}
