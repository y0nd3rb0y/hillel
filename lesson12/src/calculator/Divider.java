package calculator;

/**
 * Created by User on 28.04.2016.
 */
public class Divider extends BaseCalculator{
    Divider(int operand1,int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    int calculate(){
        return operand1/operand2;
    }
    public String printOperation() {
        return "Division";
    }
}
