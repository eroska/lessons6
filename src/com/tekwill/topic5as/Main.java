package com.tekwill.topic5as;

public class Main {
    public static void main(String[] args) {
        Cerc cercFederico = new Cerc();
        Patrat patratCarls = new Patrat(10.5);
        Romb rombJohny = new Romb();

        cercFederico.setRazaCercului(3.1465461613);
        System.out.println("Aria figurii manipulate este: " + cercFederico.returneazaAria());

        patratCarls.returneazaAria();
        System.out.println("Aria figurii manipulate este: " + patratCarls.getAriaFigurii());

        rombJohny.setDiagonale(10,-1);
        rombJohny.returneazaAria();
        System.out.println("Aria figurii manipulate este: " + rombJohny.getAriaFigurii());

    }
}
