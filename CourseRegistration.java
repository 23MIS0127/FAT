package com.example;

import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("\n--- Registration Details ---");
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        Student s = new Student(id, name, course);
        s.display();
    }
}
