package com.tekwill.topic3;

public class ExecuteOperationsMain {

    public static void main(String[] args) {

        Operations.printAritmeticOperations(5, 15);
        System.out.println();
        Operations.printAritmeticOperations(4584, 55435);
        System.out.println();
        Operations.printRelationarOperation(35, 45);
        System.out.println();
        Operations.printLogicOperations(true, false);
        System.out.println();
        Operations.printLogicOperations(true, true);
        System.out.println();
        Operations.printLogicOperations(false, true);
        System.out.println();
        Operations.printLogicOperations(false, false);
        System.out.println();
        Operations.useForAndWhile(100);
    }


}
