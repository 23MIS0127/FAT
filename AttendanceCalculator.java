package com.example;

import java.util.Scanner;

public class AttendanceCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes: ");
        int total = sc.nextInt();

        System.out.print("Enter attended classes: ");
        int attended = sc.nextInt();

        double percentage = ((double) attended / total) * 100;

        System.out.println("Attendance Percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Eligible for exam");
        } else {
            System.out.println("Not eligible for exam");
        }
    }
}
