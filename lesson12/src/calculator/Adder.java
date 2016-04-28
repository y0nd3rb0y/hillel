package calculator;

/**
 * Created by User on 28.04.2016.
 */
public class Adder extends BaseCalculator {

    Adder(int operand1,int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    int calculate() {
        int result = operand1 + operand2;
        return result;
    }

    public String printOperation() {
        return "Addition";
    }
}
