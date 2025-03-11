/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;

/**
 *
 * @author s4402831
 */
public class CourseYear {
    int yearOfCourse;
    Course course;

    public CourseYear(int yearOfCourse, Course course) {
        this.yearOfCourse = yearOfCourse;
        this.course = course;
    }

    public String toString() {
        int var10000 = this.yearOfCourse;
        return "year " + var10000 + " of " + String.valueOf(this.course);
    }
}
