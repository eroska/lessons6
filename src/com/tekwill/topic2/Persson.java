package com.tekwill.topic2;

public class Persson {
    public String lastName;
    protected String name;
    private int age;
    char gender;
    double weight;

    public void setAge(int ageAttributed) {

        this.age = ageAttributed;
        System.out.println("Age was populated with the following value " + this.age);
    }

    public int getAge() {
        return this.age;
    }

    public void lastName(String rosca) {
        this.lastName = rosca;
        System.out.println("My last name is ");
    }
}


