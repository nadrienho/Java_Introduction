/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;

/**
 *
 * @author s4402831
 */
public class Student implements Comparable<Student>{
    int id;
    String first;
    String last;
    //CourseYear courseYear;

    public Student(int id, String first, String last) {
        this.id = id;
        this.first = first;
        this.last = last;
    }

    
    public String toString() {
        return this.id + " " + this.first + " " + this.last;
        //int var10000 = this.id;
        //return "" + var10000 + " " + this.first + " " + this.last + " " + String.valueOf(this.courseYear);
    }
    @Override
    public int compareTo(Student other) {
        int lastCompare = this.last.compareTo(other.last);
        if ( lastCompare != 0) {
            return lastCompare;
        } else {
            return this.first.compareTo(other.first);
        }
    }
    
    


    
}
