package com.tekwill.topic5as;

public class Romb extends FiguraGeometrica {
    private double diagonalaMica;
    private double diagonalaMare;

    private double laturaMica;
    private double laturaMare;

    public void setDiagonale(double diagonalaMare, double diagonalaMica) {
        if ((diagonalaMare > diagonalaMica) && (diagonalaMare > 0) && (diagonalaMica > 0)) {
            this.diagonalaMare = diagonalaMare;
            this.diagonalaMica = diagonalaMica;
            System.out.println("Diagonalele au fost setate cu succes");
        } else {
            System.out.println("Ati introdus diagonalele gresit, mai incercati!");
        }
    }


    public void setLaturaMare(double laturaMare) {
        this.laturaMare = laturaMare;
    }

    public void setLaturaMica(double laturaMica) {
        this.laturaMica = laturaMica;
    }

    @Override
    public double returneazaPermetrul() {
        this.permiteruFigurii = 2 * laturaMica + 2 * laturaMare;
        return this.permiteruFigurii;
    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = (diagonalaMare * diagonalaMica) / 2;
        return this.ariaFigurii;
    }
}
