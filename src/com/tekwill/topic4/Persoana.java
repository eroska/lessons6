package com.tekwill.topic4;

public class Persoana {
    public Persoana(String numeAtribuit, int virstaPersoana) {
        nume = numeAtribuit;
        virsta = virstaPersoana;
    }

    String nume;
    int virsta;

    public void afiseazaCatergoriaDeVarsta() {
        if (virsta < 12) {
            System.out.println("Persoana este copil");
        } else if (virsta < 18) {
            System.out.println("Persoana este adolescent");
        } else if (virsta < 27) {
            System.out.println("Persoana este tanara");
        } else if (virsta < 64) {
            System.out.println("Persoana este matura");
        } else {
            System.out.println("Persoana este varstnica");
        }
    }

    public void afiseazaCatergoriaDeVarsta(double a) {
        if (virsta < 12) {
            System.out.println("Persoana este copil");
        } else if (virsta < 18) {
            System.out.println("Persoana este adolescent");
        } else if (virsta < 27) {
            System.out.println("Persoana este tanara");
        } else if (virsta < 64) {
            System.out.println("Persoana este matura");
        } else {
            System.out.println("Persoana este varstnica");
        }
    }

}
