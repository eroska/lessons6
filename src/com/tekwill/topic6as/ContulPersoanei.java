package com.tekwill.topic6as;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.ExecutionException;

public class ContulPersoanei {

    private String numePersoana;
    private int id;
    private double sumaCurenta;

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumaCurenta(double sumaCurenta) {
        if (sumaCurenta > 0) {
            this.sumaCurenta = sumaCurenta;
        } else System.out.println("Nu poti avea sold negativ!");
    }

    public String getNumePersoana() {
        return this.numePersoana;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public int getId() {
        return id;
    }

    public double sustragereDeBani(double sumaExtrasa) {
        if (sumaExtrasa > sumaCurenta) {
            System.out.println("Sold Insuficient, mai incearca!");
        }
        return (sumaCurenta - sumaExtrasa);
    }

    public int imparteSoldulLaNPersoane(int numarDePersoane) {
        int result = 0;
        try {
            result = (int) sumaCurenta / numarDePersoane;
        } catch (ArithmeticException exceptieObiect) {
            System.out.println("Ai introdus valoarea 0, respectiv retunam 0");
        }
        return result;
    }

    public void transferCatreOPersoaneAlCareiDateSuntIntrunFisierAruncare(String directoriuCuFIsierulDat) throws FileNotFoundException {
        File datelePentruTransfer001 = new File(directoriuCuFIsierulDat);
        FileReader fileReader001 = new FileReader(datelePentruTransfer001);
    }

    public void transferCatreOPersoaneAlCareiDateSuntIntrunFisierTratare(String directoriuCuFIsierulDat) {
        File datelePentruTransfer001 = new File(directoriuCuFIsierulDat);
        try {
            FileReader fileReader001 = new FileReader(datelePentruTransfer001);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Please review the entered data");
        } finally {
            System.out.println("Acest cod este rulat indiferent de ce se intampla mai sus");
        }
    }
}