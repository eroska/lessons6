package com.tekwill.topic5;

public class Main {

    public static void main(String[] args) throws Exception {
        Cerc cerc1 = new Cerc();
        Patrat patrat1 = new Patrat();
        Romb romb1 = new Romb();

        cerc1.setRazaCercului(20);
        patrat1.setLungimeaLaturaPtrat(50);
        romb1.setInaltimeaRombului(45.2);
        romb1.setLaturaRombului(35.5);

        System.out.println("Aria cercului este = " + cerc1.returneazaAria());
        System.out.println("Perimetru cercului este = " + cerc1.returneazaPerimetru());

        System.out.println("Aria patratului este = " + patrat1.returneazaAria());
        System.out.println("Perimetru patratului este = " + patrat1.returneazaPerimetru());

        System.out.println("Aria rombului este = " + romb1.returneazaAria());
        System.out.println("Perimetru rombului este = " + romb1.returneazaPerimetru());
    }
}
