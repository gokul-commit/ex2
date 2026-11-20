
package org.example;

import java.util.Scanner;

public class Main {

    public static String calculateGrade(double average) {
        if (average >= 90)
            return "A";
        else if (average >= 75)
            return "B";
        else if (average >= 50)
            return "C";
        else
            return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark in Subject 3: ");
        int m3 = sc.nextInt();

        double average = (m1 + m2 + m3) / 3.0;

        System.out.println("Average = " + average);
        System.out.println("Grade = " + calculateGrade(average));
        sc.close();
    }
}
