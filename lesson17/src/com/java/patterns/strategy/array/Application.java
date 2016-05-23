package com.java.patterns.strategy.array;

public class Application {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 89, 2, 2};
        Operation operation = new Operation(new OperationGetMin());
        System.out.println("Min is: "+operation.doOperation(array));
        operation.setOperationStrategy(new OperationGetMax());
        System.out.println("Max is: "+operation.doOperation(array));
        operation.setOperationStrategy(new OperationGetRandom());
        System.out.println("Random element: "+operation.doOperation(array));
        operation.setOperationStrategy(new OperationStrategy() {
            @Override
            public int doOperation(int[] array) {
                if(array.length == 0) return 0;

                for(int element: array){
                    if(element % 2 == 0) return element;
                }
                return 0;

            }
        });
        System.out.println("First even: "+operation.doOperation(array));

    }

}
