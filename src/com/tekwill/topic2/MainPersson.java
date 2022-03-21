package com.tekwill.topic2;

public class MainPersson {

    public static void main(String[] args) {

        Persson marinelPersson = new Persson();
        marinelPersson.name = "Marin";
        System.out.println("My name is " + marinelPersson.name);
        marinelPersson.setAge(41);
        System.out.println(marinelPersson.getAge());
        marinelPersson.lastName("Rosca");
        System.out.println(marinelPersson.lastName);
        marinelPersson.gender = 'M';
        System.out.println("My gemder is " + marinelPersson.gender);
        marinelPersson.weight = 81.500;
        System.out.println("My weight is " + marinelPersson.weight + "Kg");


    }


}
