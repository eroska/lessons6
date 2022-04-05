package com.tekwill.topic7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    private String path;
    private String fileName;
    private String fileText;

    public String getFileText() {
        return fileText;
    }

    public void setFileText(String fileText) {
        this.fileText = fileText;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    static void scriereaInformatieTextFisier(String caleaCatreFisier, String text) throws IOException {
        //check if file exist
        File file = new File(caleaCatreFisier);
        FileWriter fileWriter = new FileWriter(file);
        if (file.exists()) {
            System.out.println("File Exist");
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
        } else {
            System.out.println("File dose not exist");
        }

        throw new FileNotFoundException();

    }

    static void alipireaInformatieiLaFisie(String caleaCatreFisier, String date) throws IOException {
        File file1 = new File(caleaCatreFisier);

        if (file1.exists()) {
            System.out.println("File Exist for append");
            FileWriter fileWriter1 = new FileWriter(file1, true);
            fileWriter1.append(date);
            fileWriter1.flush();
            fileWriter1.close();
        } else {
            System.out.println("File dose not exist for append");
        }

        throw new IOException();
    }



     static String citireDateDinFisier(String caleaCatreFisier) throws IOException {
        return Files.readString(Path.of(caleaCatreFisier));
    }

}
