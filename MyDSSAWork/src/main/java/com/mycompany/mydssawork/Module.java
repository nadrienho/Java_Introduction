/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;

/**
 *
 * @author s4402831
 */
public class Module {
    String code;
    String name;

    public Module(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String toString() {
        return this.code + " " + this.name;
    }
}
