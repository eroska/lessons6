package com.tekwill.topic8;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte carte1 = new Carte("How to win Friends and Influence people", "Dale Carnegie", 9780091, 275);
        Carte carte2 = new Carte("Cele 21 de legi supreme ale Liderului", "John C Maxwell", 9789731, 299);
        Carte carte3 = new Carte("Dare to lead", "Brene Brown", 90000, 298);
        Carte carte4 = new Carte("Cum schimbarea aduce succesul", "Dale Carnegie && Associates", 4405517, 266);
        Carte carte5 = new Carte("The 7 Habits of highly effective people", "Stephen R. Covey", 1471121939, 391);

        Stoc stoc1 = new Stoc(478, " Chisinau Socoleni 7");
        Stoc stoc2 = new Stoc(658, "Balti Stefan cel Mare");

        stoc1.carteInSstoc(carte1);
        stoc1.carteInSstoc(carte2);
        stoc1.carteInSstoc(carte3);
        stoc1.carteInSstoc(carte4);
        stoc1.carteInSstoc(carte5);
        stoc1.carteInSstoc(carte3);
        stoc1.carteInSstoc(carte4);

        stoc2.carteInSstoc(carte1);
        stoc2.carteInSstoc(carte2);
        stoc2.carteInSstoc(carte3);

        stoc1.existaCarteInStoc(carte1);
        stoc2.existaCarteInStoc(carte5);
        stoc1.existaCarteInStoc(carte3);

        stoc1.numarDeCartiInStoc();
        stoc2.numarDeCartiInStoc();

        stoc1.stergeCarteDinStoc(carte1);
        stoc2.stergeCarteDinStoc(carte3);

        stoc1.esteStoculGol();
        stoc2.esteStoculGol();

        stoc2.stergeCarteDinStoc(carte1);
        stoc2.stergeCarteDinStoc(carte2);
        stoc2.esteStoculGol();
    }
}
