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
public class FCount {
    public static String makeTTString() {
    int table = 2;
    String s = "";
    while(table <= 12) {
      int mult = 1;
      while(mult <= 12) {
        s = s + mult + " times " + table + " is " + (mult * table);
        mult = mult + 1;
      }
      table = table + 1;
    }
    return s;
    }
    
    public static Map<Character,Integer> frequencyCount(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }

            }
        return map;
    }

    
    public static void main(String[] args){
        String s = makeTTString();
        System.out.println(s);
        Map<Character,Integer> d = frequencyCount(s);

        System.out.println();
        System.out.println("Frequency map:");
        for(Map.Entry<Character, Integer> me : d.entrySet()) {
            System.out.println( me);
        }
        
    }

}
