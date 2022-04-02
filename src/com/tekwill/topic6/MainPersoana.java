package com.tekwill.topic6;

public class MainPersoana {

    public static void main(String[] args) throws Exception {
        ContulPersoanei contulPersoanei = new ContulPersoanei();
        contulPersoanei.setId(258469342);
        contulPersoanei.setNumePersoana("Rusu Vasile");
        contulPersoanei.setSumaCurenta(29564);

        try {
            contulPersoanei.sustragereBani(20000);
        } catch (ArithmeticException e) {
            System.out.println("Opreatinuea a esuat. Incercati mai tirziu!");
        } finally {
            System.out.println("Meniul Principal");
        }

        contulPersoanei.transferCatreOPersoana(1500, 12345678, "Ion", 980);
    }

}
