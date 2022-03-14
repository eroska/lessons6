package com.tekwill.topic1;

public class Employee {
    String name;
    int age;
    double salary;
    String gender;

    Employee() {
    }
    //constructor cu doi parametri
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Employee " + name + " is " + age + " years old.");
    }

    //metoda
    public void setSalary(double salary) {
        this.salary = salary;
        System.out.println("New salary is " + salary);

    }

    //metoda
    public void setGender(String gender) {
        this.gender = gender;
        System.out.println("Gender is " + gender);

    }


}
