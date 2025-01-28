/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mydsawork;

/**
 *
 * @author s4402831
 */
public class HelloWorld {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //int n = 2;
        //while (n<= 12){
        //    printTimestable(n);
        //    n = n + 1;
        //}
        
        printArrayTable(5);
        printArrayTable(6);
        printArrayTable(7);
        
        Student s1 = new Student( 25, "Donald", "Duck");
        Student s2 = new Student( 26, "Mickey", "Mouse");
        Student s3 = new Student( 27, "Bugs", "Bunny");
        Student s4 = new Student( 28, "Minnie", "Mouse");
        
        System.out.println( s1.id);
        System.out.println( s2.id + " " + s2.first + " " + s2.last);

        System.out.println(s1.toString());
        
        System.out.println(s1);
        
        printStudentArray();
    }
    public static void printTimestable(int table) {
    System.out.println("This is the " + table + "times table:");
    int m = 1;
    while(m <= 12){
        int a = table * m;
        System.out.println(table + " times " + m + " is " + a);
        m = m+1;
        }
    System.out.println();
    }
    
    public static void printArrayTable(int table) {
        int m = 1;
        int[] ans = new int[12];
        while(m <= 12){
            int a = table * m;
            ans[m-1] = a;
            m = m+1;
        }
        
        System.out.println( table + " times table: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        
    }
    public static void printStudentArray(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many students do you want to enter? ");
        int number = scanner.nextLine();
        Student[] person = new Student[number];
        for (int i =0; i< number; i++){
            System.out.println("Enter the student ID :");
            int id = scanner.nextLine();
            person[i].id = id;
            System.out.println("Enter the first name:");
            String fname = scanner.nextInt();
            person[i].first = fname;
            System.out.println("Enter the last name:");
            String lname = scanner.nextInt();
            person[i].last = lname;
        
        }
        for (int i=0; i<number; i++){
            System.out.println(person[i]);
            System.out.println();
        }
        
    } 
    
}
