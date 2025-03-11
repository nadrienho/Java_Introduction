/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;

/**
 *
 * @author s4402831
 */
public class HelloWorld {
    
    public static void main(String[] args) {
        printArrayTable(5);
        printArrayTable(6);
        printArrayTable(7);
        Student s1 = new Student(25, "Donald", "Duck");
        Student s2 = new Student(26, "Mickey", "Mouse");
        new Student(27, "Bugs", "Bunny");
        new Student(28, "Minnie", "Mouse");
        System.out.println(s1.id);
        System.out.println(s2.id + " " + s2.first + " " + s2.last);
        System.out.println(s1.toString());
        System.out.println(s1);
        printStudentArray();
    }

    public static void printTimestable(int table) {
        System.out.println("This is the " + table + "times table:");

        for(int m = 1; m <= 12; ++m) {
            int a = table * m;
            System.out.println("" + table + " times " + m + " is " + a);
        }

        System.out.println();
    }

    public static void printArrayTable(int table) {
        int m = 1;

        int[] ans;
        int i;
        for(ans = new int[12]; m <= 12; ++m) {
            i = table * m;
            ans[m - 1] = i;
        }

        System.out.println("" + table + " times table: ");

        for(i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }

        System.out.println();
    }

    public static void printStudentArray() {
    }
}
