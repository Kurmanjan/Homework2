package com;

import com.company.Printable;

public class Student extends Person implements Printable {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Student:"+ super.toString();
    }
    public void addCoursesGrade (String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    public  double getAveragegrade(){
        int sum = 0;
        for (int i = 0; i <numCourses ; i++) {
            sum +=grades[i];

        }
        return(double)sum/numCourses;
    }

    @Override
    public String print(){
        return "Количества курсов" + courses + "/n" + "Оценка" + grades;

        }
    }

