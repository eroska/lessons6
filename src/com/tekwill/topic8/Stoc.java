package com.tekwill.topic8;

import java.util.ArrayList;
import java.util.List;

public class Stoc {
    private int stocId;
    private String adresaMagazin;
    List<Carte> cartileDinStoc = new ArrayList<>();

    public Stoc(int stocId, String adresaMagazin) {
        this.stocId = stocId;
        this.adresaMagazin = adresaMagazin;
    }

    public void carteInSstoc(Carte carte) {
        cartileDinStoc.add(carte);
    }

    public void stergeCarteDinStoc(Carte carte) {
        cartileDinStoc.remove(carte);
    }

    public void existaCarteInStoc(Carte carte) {
        if (cartileDinStoc.isEmpty()) {
            System.out.println("Stocul este gol.");
        } else {
            System.out.println("Sunt carti in stoc.");
        }
    }

    public void numarDeCartiInStoc() {
        System.out.println("Grabestite au mai ramas " + cartileDinStoc.size() + " Carti");
    }

    public void esteStoculGol() {
        if (cartileDinStoc.isEmpty()) {
            System.out.println("Nu au mai ramas carti in stoc");
        } else {
            System.out.println("Au mai ramas " + cartileDinStoc.size() + " Carti in stoc");
        }
    }
}
