package calculator;

public class PassingTest {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 3;
        System.out.println(var1+" "+var2);
        swap(var1, var2);
        System.out.println(var1+" "+var2);
    }
    private static void swap(int var1, int var2){
        int temp = var1;
        var1 = var2;
        var2 = temp;
    }
}
