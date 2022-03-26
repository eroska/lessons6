package com.tekwill.topic5;

public class Romb extends FiguraGeometrica {

    private double laturaRombului;
    private double inaltimeaRombului;

    public double getLaturaRombului() {
        return laturaRombului;
    }

    public void setLaturaRombului(double laturaRombului) {
        this.laturaRombului = laturaRombului;
    }

    public double getInaltimeaRombului() {
        return inaltimeaRombului;
    }

    public void setInaltimeaRombului(double inaltimeaRombului) {
        this.inaltimeaRombului = inaltimeaRombului;
    }

    @Override
    double returneazaAria() {
        double aria = laturaRombului * inaltimeaRombului;
        return aria;
    }

    @Override
    double returneazaPerimetru() {
        double perimetru = 4 * laturaRombului;
        return perimetru;
    }
}
