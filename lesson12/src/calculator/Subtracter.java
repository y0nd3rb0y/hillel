package calculator;

/**
 * Created by User on 28.04.2016.
 */
public class Subtracter extends BaseCalculator {
    Subtracter(int operand1,int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    @Override
    int calculate() {
        return operand1 - operand2;
    }
    public String printOperation() {
        return "Substraction";
    }
}
