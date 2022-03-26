package com.tekwill.topic4;

import java.util.Scanner;

public class ExecuteMethods {
    public static void main(String[] args) {
        int rezultat = Methods.sum(20, 5);
        System.out.println(rezultat);

        int rezultat2 = Methods.sum(20, 20);
        System.out.println(rezultat2);

        int rezultat3 = Methods.sum(10, 10000);
        System.out.println(rezultat3);

        Methods.sum(5.5);

        Scanner scanerulMeu = new Scanner(System.in);
        System.out.print("Introduceti varsta lui Andrei:");
        int varsta = scanerulMeu.nextInt();

        Persoana andreiS = new Persoana("Andrei S", varsta);
        andreiS.afiseazaCatergoriaDeVarsta(5);
        andreiS.afiseazaCatergoriaDeVarsta();

    }
}
