package com.tekwill.topic6as;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ContulPersoanei contul001 = new ContulPersoanei();
        contul001.setId(10001);
        contul001.setNumePersoana("Mehedint Eugeniu");
        contul001.setSumaCurenta(3000.25);


//        System.out.println("Introduceti numarul de persoane: ");

//        Scanner cititor = new Scanner(System.in);
//        int numarDePersoane = cititor.nextInt();
//        System.out.println("Soldul curent impartit la " + numarDePersoane + " persoane = " + contul001.imparteSoldulLaNPersoane(numarDePersoane));

        contul001.transferCatreOPersoaneAlCareiDateSuntIntrunFisierAruncare("C:\\Users\\andrei.secu\\Desktop\\tac\\lessons6\\src\\com\\tekwill\\topic2\\MainPersson.java");

        contul001.transferCatreOPersoaneAlCareiDateSuntIntrunFisierTratare("C:\\Users\\andrei.secu\\Desktop\\tac\\lessons6\\src\\com\\tekwill\\topic2\\MainPersson.java");
    }

}
