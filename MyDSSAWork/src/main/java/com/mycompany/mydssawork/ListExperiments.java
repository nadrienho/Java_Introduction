/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author s4402831
 */
public class ListExperiments {
    public ListExperiments() {
    }

    public static void main(String[] args) {
        ArrayList<String> myList1 = new ArrayList();
        LinkedList<String> myList2 = new LinkedList();
        demonstrateList(myList1);
        demonstrateList(myList2);
    }

    public static void demonstrateList(List<String> list) {
        list.add("Apples");
        list.add("Oranges");
        list.add("Bananas");
        System.out.println(list);
        list.add(1, "Pineapples");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
    }
}
