/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydsawork;

/**
 *
 * @author s4402831
 */
public class Student {
    int id;
    String first;
    String last;
    public Student (int id, String first, String last) {
        this.id = id;
        this.first = first;
        this.last = last;
    
    }
    public String toString() {
        return this.id + " " + this.first + " " + this.last;
    }
    
    
    
}
