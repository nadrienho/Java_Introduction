/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;

/**
 *
 * @author s4402831
 */
public class Course {
    String name;
    int length;
    int level;

    public Course(String name, int length, int level) {
        this.name = name;
        this.length = length;
        this.level = level;
    }

    public String toString() {
        return this.name + ", " + this.length + " years, Level " + this.level;
    }
}
