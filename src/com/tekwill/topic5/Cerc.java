package com.tekwill.topic5;

public class Cerc extends FiguraGeometrica {

    private double razaCercului;
    final double pi = 3.14;

    public double getRazaCercului() {
        return razaCercului;
    }

    public void setRazaCercului(double razaCercului) {
        this.razaCercului = razaCercului;
    }

    @Override
    double returneazaAria() {
        double aria = pi * razaCercului * razaCercului;
        return aria;
    }

    @Override
    double returneazaPerimetru() {
        double perimetru = 2 * pi * razaCercului;
        return perimetru;
    }
}
