package com.tekwill.topic7as;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String adresaFisierului = "src/com/tekwill/topic7as/fisirulDeLuu.txt";

        String dateDeScriere = "Test Data care se scrie in fisier";
        FileManager.scriereaInformatieiInFisier(adresaFisierului, dateDeScriere);

        String dateDeScriereDinIncercarea2 = "Alte date!";
        FileManager.scriereaInformatieiInFisier(adresaFisierului, dateDeScriereDinIncercarea2);


        FileManager.alipireaInformatieiLaFisier(adresaFisierului, "Info 1 ");
        FileManager.alipireaInformatieiLaFisier(adresaFisierului, "Info 3 ");

        System.out.println(FileManager.citireDateDinFisier(adresaFisierului));
    }
}
