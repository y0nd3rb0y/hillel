package com.java.patterns.strategy.array;

public class Operation{
    private OperationStrategy operationStrategy;
    public Operation(OperationStrategy operationStrategy){
        this.operationStrategy = operationStrategy;
    }

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int doOperation(int[] array){
        return operationStrategy.doOperation(array);
    }
}
