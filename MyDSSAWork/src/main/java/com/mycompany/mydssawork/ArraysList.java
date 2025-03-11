/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;

/**
 *
 * @author s4402831
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysList {
    public ArraysList() {
    }

    public static void main(String[] args) {
        String[] menuArray = new String[]{"1 - new list", "2 - add item", "3 - remove item", "4 - quit"};
        List<String> menu = new ArrayList(Arrays.asList(menuArray));
        List<String> myList = new ArrayList();
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your option: ");
        int option = scanner.nextInt();

        while(option != 4) {
            if (option == 1) {
                clearList(myList);
                System.out.println(menu);
                System.out.println("Enter your option: ");
                option = scanner.nextInt();
            } else if (option == 2) {
                addItem(myList);
                System.out.println(menu);
                System.out.println("Enter your option: ");
                option = scanner.nextInt();
            } else if (option == 3) {
                System.out.print("Enter the index to delete: ");
                int index = scanner.nextInt();
                deleteItem(myList, index);
                System.out.println(menu);
                System.out.println("Enter your option: ");
                option = scanner.nextInt();
            }
        }

        if (option == 4) {
            System.exit(0);
        }

    }

    public static void clearList(List<String> myList) {
        myList.clear();
        System.out.println(" Updated Array: " + String.valueOf(myList));
    }

    public static void addItem(List<String> myList) {
        System.out.print("Enter something to enter to the list ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        myList.add(item);
        System.out.println(" Updated Array: " + String.valueOf(myList));
    }

    public static void insertItem(List<String> myList, String item, int index) {
        if (index >= 0 && index <= myList.size()) {
            myList.add(index, item);
            System.out.println(" Updated Array: " + String.valueOf(myList));
        } else {
            System.out.println("Invalid Position");
        }

    }

    public static void deleteItem(List<String> myList, int index) {
        if (index >= 0 && index <= myList.size()) {
            myList.remove(index);
            System.out.println(" Updated Array: " + String.valueOf(myList));
        } else {
            System.out.println("Invalid Position");
        }

    }
}
