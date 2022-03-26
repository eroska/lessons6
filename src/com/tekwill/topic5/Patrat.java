package com.tekwill.topic5;

public class Patrat extends FiguraGeometrica {

    private double lungimeaLaturaPtrat;

    @Override
    double returneazaAria() {
        double aria = lungimeaLaturaPtrat * lungimeaLaturaPtrat;
        return aria;
    }

    public double getLungimeaLaturaPtrat() {
        return lungimeaLaturaPtrat;
    }

    public void setLungimeaLaturaPtrat(double lungimeaLaturaPtrat) {
        this.lungimeaLaturaPtrat = lungimeaLaturaPtrat;
    }

    @Override
    double returneazaPerimetru() {
        double perimetru = 4 * lungimeaLaturaPtrat;
        return perimetru;
    }
}
