package com.company;

import com.Student;

public class Main {


    public static void main(String[] args) {
        createObject("Student");
        System.out.println("__________________");
        createObject("Teacher");
        System.out.println("____________________");
        createObject("Administrator");
        System.out.println("____________________");

    }


    public static String createObject(String className) {
        switch (className) {
            case "Student":
                Student s = new Student("Student", "Isanova 128");
                System.out.println("Название студента:" + s.getName() + "/n" + s.print());
                break;
            case "Teacher":
                Teacher t = new Teacher("Teacher", "Ahumbaeve128");
                System.out.println("Название:" + t.getName() + "/n" + t.print());
                break;
            case "Administrator":
                Adminstrator adminstrator = new Adminstrator("Nurgazy", "mkrn10");
                System.out.println("Названия" + adminstrator.getName() + "/n" + adminstrator.print());

        }
        return className;

    }
}
