package calculator;

public class Main {
    public static void main(String[] args) {
        BaseCalculator[] calculators = {new Adder(2,3), new Subtracter(5,2), new Multiplier(123,5), new Divider(3,8)};
        for (BaseCalculator calculator : calculators){
            //System.out.println(calculator.getClass().getSimpleName()+" result is: "+calculator.calculate());
            System.out.println(calculator.printOperation()+" result is: "+calculator.calculate());
        }
    }
}
