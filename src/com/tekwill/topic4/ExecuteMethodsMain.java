package com.tekwill.topic4;

public class ExecuteMethodsMain {

    public static void main(String[] args) {

        int result = Methods.sum(25, 15);
        System.out.println(result);

        int result2 = Methods.sum(20, 20);
        System.out.println(result2);

        int result3 = Methods.sum(10, 190000);
        System.out.println(result3);

        Methods.sum(529.25);

    }
}
