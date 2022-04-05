package com.tekwill.topic7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        FileManager fileManager = new FileManager();
        fileManager.setPath("src/com/tekwill/topic7/");
        fileManager.setFileName("JavaFile.txt");
        fileManager.setFileText("Ion Creanga\nCapra cu trei iezi");

        try {
            FileManager.scriereaInformatieTextFisier(fileManager.getPath() + fileManager.getFileName(), fileManager.getFileText());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        fileManager.setFileText("\nPoveste buna pentru copii");
        try {
            FileManager.alipireaInformatieiLaFisie(fileManager.getPath() + fileManager.getFileName(), fileManager.getFileText());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try {
            System.out.println("Rezultatul operatiei de citire este:");
            System.out.println(FileManager.citireDateDinFisier(fileManager.getPath() + fileManager.getFileName()));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
