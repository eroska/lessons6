package com.tekwill.topic5;

public class Patrat extends FiguraGeometrica {

    private double lungimeaLaturaPtrat;

    @Override
    double returneazaAria() {
        aria = lungimeaLaturaPtrat * lungimeaLaturaPtrat;
        return aria;
    }

    public double getLungimeaLaturaPtrat() {
        return lungimeaLaturaPtrat;
    }

    public void setLungimeaLaturaPtrat(double lungimeaLaturaPtrat) throws Exception {
        if (lungimeaLaturaPtrat <= 0) {
            throw new Exception("Valoarea laturii patratului introduse nu poate fi mai mica ca zero ");
        } else {
            this.lungimeaLaturaPtrat = lungimeaLaturaPtrat;
        }

    }

    @Override
    double returneazaPerimetru() {
        perimetru = 4 * lungimeaLaturaPtrat;
        return perimetru;
    }
}
