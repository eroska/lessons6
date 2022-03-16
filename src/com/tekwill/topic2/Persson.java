package com.tekwill.topic2;

public class Persson {
    private String lastName;
    private String name;
    int age;
    char gender;
    double weight;

    public void doSomething() {

        lastName = "Palamarcic";
        System.out.println("Hi, my last name is: " + lastName);
        name = "Ruslan";
        System.out.println("I am: " + name);

        System.out.println("I have:  " + age + " Years old");
        System.out.println("My gender is: - " + gender);
        System.out.println("My weight is: - " + weight + " kg");
    }

}
