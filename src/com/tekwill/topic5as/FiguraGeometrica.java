package com.tekwill.topic5as;

public abstract class FiguraGeometrica {

    protected double ariaFigurii;
    protected double permiteruFigurii;

    public abstract double returneazaAria();

    public abstract double returneazaPermetrul();

    public double getAriaFigurii() {
        return ariaFigurii;
    }

    public double getPermiteruFigurii() {
        return permiteruFigurii;
    }
}
