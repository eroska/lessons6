package com.tekwill.topic8;

public class Carte {
    private String titlu;
    private String autor;
    private int numarSerie;
    private int pagini;

    public Carte(String titlu, String autor, int numarSerie, int pagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.numarSerie = numarSerie;
        this.pagini = pagini;
    }

    public String toString() {
        return "Titlu: " + titlu + "\nAutor: " + autor + "\nSerie: " + numarSerie + "\nPagini: " + pagini;
    }
}
