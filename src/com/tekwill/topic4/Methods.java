package com.tekwill.topic4;

public class Methods {

    static int sum(int firstNumber, int secondNumber) {
        int suma = 0;
        if (firstNumber > secondNumber) {
            System.out.println("Can't calculate the amount of this wrong interval");
            return suma;
        } else if (firstNumber == secondNumber) {
            System.out.println("The first number is the same as the second");
            return firstNumber;
        } else {
            for (int i = firstNumber; i <= secondNumber; i++) {
                suma = suma + i;
            }
            System.out.println("The execution of the for cycle has ended");

            System.out.println("The while cycle is over");

            System.out.println("The Method was completed");
            return suma;
        }


    }

    static void sum(double a) {
        double suma = 0;
        if (a > 0) {
            while (a > 0) {
                suma = suma + a;
                a--;
            }
            System.out.println("The execution of while is finished");
            System.out.println(suma);

        } else if (a == 0) {
            System.out.println("The sum is zero");
        } else {
            System.out.println("A is less than zero");

        }
    }

    static double sum(float a) {

        double suma = 0;
        if (a > 0) {
            while (a > 0) {
                suma = suma + a;
                a--;
            }
            System.out.println("The execution of while is finished");
            System.out.println(suma);

        } else if (a == 0) {
            System.out.println("The sum is zero");
        } else {
            System.out.println("A is less than zero");

        }
        return suma;
    }

}


