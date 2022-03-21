package com.tekwill.topic3;

public class Operations {

    static void printAritmeticOperations(int a, int b) {
        /*int a = 5;
        int b = 15;*/
        System.out.println("Adunarea " + (a + b));
        System.out.println("Scaderea " + (a - b));
        System.out.println("Inmultirea " + (a * b));
        System.out.println("Inpartirea " + (a / b));
        System.out.println("Restul impartirii " + (a % b));
        System.out.println("Pre-incriment" + (++a));
        System.out.println("Post-incriment" + (a++));
        // System.out.println("Pre-decriment " + (--a));
        //System.out.println("Post-decrement" +(a--));


    }


    static void printRelationarOperation(int a, int b) {
       /* int a = 5;
        int b =15;*/
        System.out.println("Equality " + (a == b));
        System.out.println("Not equal " + (a != b));
        System.out.println("Greater " + (a > b));
        System.out.println("Less " + (a < b));
        System.out.println("Greater equal " + (a >= b));
        System.out.println("Less equal " + (a <= b));

    }

    static void printLogicOperations(boolean a, boolean b) {
       /* boolean a = true;
        boolean b = false;*/
        System.out.println("AND: " + (a && b));
        System.out.println("OR: " + (a || b));
        System.out.println("Negation: " + (!a));


    }

    static void useForAndWhile(int limita) {
        int index = 10;
        int limit = 100;
        while (index <= limit) {
            System.out.print(index + " ");
            index++;
            System.out.println("Valoarea lui index la finalul executei While este " + index);
            for (int i = 10; i <= limit; i++) {
                System.out.print(i + " ");
                System.out.print(" ");
            }

        }


    }


}
