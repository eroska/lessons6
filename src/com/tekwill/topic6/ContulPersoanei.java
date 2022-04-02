package com.tekwill.topic6;

public class ContulPersoanei {

    private String numePersoana;
    private int id;
    private double sumaCurenta;

    public String getNumePersoana(String numePersoana) {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public int getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(double sumaCurenta) {
        System.out.println("Suma dumneavoastra curenta este " + sumaCurenta);
        if (sumaCurenta > 0) {
            this.sumaCurenta = sumaCurenta;
        } else {
            System.out.println("Aceasta operatiune nu esta posibila. :( ");
        }
    }

    public double sustragereBani(double sumaExtrasa) {
        if (sumaExtrasa > sumaCurenta) {
            System.out.println("Sold insuficient, introduceti o alta suma.");
        } else {
            System.out.println("Asteptati! Are loc eliberarea sumei " + sumaExtrasa);
            sumaCurenta = sumaCurenta - sumaExtrasa;
            System.out.println("Beneficiar: " + numePersoana +
                    "\nID: " + id +
                    "\nSold Final: " + sumaCurenta);
        }

        return sumaExtrasa;

    }

    public double transferCatreOPersoana(double sumaTransferata, int idBineficiar, String numeBenificiar, int codValuta){
        if (sumaCurenta >= sumaTransferata) {
            sumaCurenta = sumaCurenta - sumaTransferata;

            System.out.println("\nTranzactia a fost executata cu succes.\n" +
                    "Detalii tranzctie: \n" +
                    "Nume benificiar: " + numeBenificiar +
                    "\nId benificiar: " + idBineficiar +
                    "\nCod valuta: " + codValuta +
                    "\nSuma transferata: " + sumaTransferata);
        } else {
            System.out.println("Sold insuficient, introduceti o alta suma.");
        }
        return sumaTransferata;
    }
}
