package ua.od.hillel.variables;

public class VariableScope {
    static int classVariable = 65;
    public static void main(String[] args) {
        int num =1;
        if (num > 0){
            int var1=5;
            System.out.println("num > 0 "+var1);
        }
        System.out.println(num);
        //System.out.println("Var1"+var1);
        System.out.println("Class var:"+classVariable);
        VariableScope.method();
    }

    public static void method(){
        System.out.println("Class variable: "+classVariable);
    }

}
