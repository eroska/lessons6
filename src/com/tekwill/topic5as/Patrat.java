package com.tekwill.topic5as;

public class Patrat extends FiguraGeometrica {
    public Patrat(double marimeaLatureiAtribuite){
        latura = marimeaLatureiAtribuite;
    }

    private double latura;

    @Override
    public double returneazaAria() {
        this.ariaFigurii = latura * latura;
        return this.ariaFigurii;
    }

    @Override
    public double returneazaPermetrul() {
        this.permiteruFigurii = 4 * latura;
        return this.permiteruFigurii;
    }
}
