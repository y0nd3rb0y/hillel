package calculator;

/**
 * Created by User on 28.04.2016.
 */
public class Multiplier extends BaseCalculator {
    Multiplier(int operand1,int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    @Override
    int calculate() {
        return operand2 * operand1;
    }
    public String printOperation() {
        return "Multiplication";
    }
}
