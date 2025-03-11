/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;
import java.util.*;

/**
 *
 * @author s4402831
 */

public class StudentNumberComparator implements Comparator<Student> {
        @Override
        public int compare( Student s1, Student s2) {
            return s1.id - s2.id;
        }
    }
