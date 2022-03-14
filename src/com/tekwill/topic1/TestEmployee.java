package com.tekwill.topic1;

public class TestEmployee {
    public static void main(String[] args) {
//Crearea obiectului Employee cu denumiree employee001
        Employee employee001;

        employee001 = new Employee();
        employee001.age = 36;
        employee001.name = "Varvara";
        employee001.gender = "Female";
        employee001.salary = 6900;

        employee001.setGender(employee001.gender);
        employee001.setSalary(employee001.salary);

        new Employee(employee001.name, employee001.age);

    }
}
