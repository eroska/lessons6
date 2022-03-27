package com.tekwill.topic5;

public class Cerc extends FiguraGeometrica {

    private double razaCercului;
    final double pi = 3.14;

    public double getRazaCercului() {
        return razaCercului;
    }

    public void setRazaCercului(double razaCercului) throws Exception {
        if (razaCercului <= 0) {
            throw new Exception("Valoarea razei cercului introduse nu poate fi mai mica ca zero ");
        } else {
            this.razaCercului = razaCercului;

        }
    }

    @Override
    double returneazaAria() {
        aria = pi * razaCercului * razaCercului;
        return aria;
    }

    @Override
    double returneazaPerimetru() {
        perimetru = 2 * pi * razaCercului;
        return perimetru;
    }
}
