/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;

/**
 *
 * @author s4402831
 */
public class StudentStuff {
    public StudentStuff() {
    }

    public static void main(String[] args) {
        Course c1 = new Course("BSc(Hons) Computer Science", 3, 6);
        System.out.println(c1);
        CourseYear cy1 = new CourseYear(1, c1);
        System.out.println(cy1);
        Student s1 = new Student(25, "Donald", "Duck");
        //s1.courseYear = cy1;
        System.out.println(s1);
    }
}