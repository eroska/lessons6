package com.tekwill.topic5;

public class Romb extends FiguraGeometrica {

    private double laturaRombului;
    private double inaltimeaRombului;

    public double getLaturaRombului() {
        return laturaRombului;
    }

    public void setLaturaRombului(double laturaRombului) throws Exception {
        if (laturaRombului <= 0) {
            throw new Exception("Valoarea laturii rombului introduse nu poate fi mai mica ca zero ");
        } else {
            this.laturaRombului = laturaRombului;
        }

    }

    public double getInaltimeaRombului() {
        return inaltimeaRombului;
    }

    public void setInaltimeaRombului(double inaltimeaRombului) throws Exception {
        if (inaltimeaRombului <= 0) {
            throw new Exception("Valoarea inaltimii rombului introduse nu poate fi mai mica ca zero ");
        } else {
            this.inaltimeaRombului = inaltimeaRombului;
        }

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
