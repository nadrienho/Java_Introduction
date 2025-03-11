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
public class JavaMapAndSetExercises {
    /**
     * Prints all items in the given Collection. The generic type is a “?”
  * so that this can be called with collections of ANY type.
 * System.out.println automatically calls the toString method of the 
 * items in the collection. The Collection could be a List or Set.
	 */
    public static void printCollection( Collection<?> items) {
        for( Object o : items){
            System.out.println( o);
        }
        System.out.println( "--");
	}
    public static void main(String[] args) {
        Set<String> names = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        List<String> nameList = new ArrayList<String>();
        RandomLists.generateRandomNameList(nameList, 10);
        
        Set<Student> snames = new TreeSet<Student>(new StudentNumberComparator());
        List<Student> snameList = new ArrayList<Student>();
        RandomLists.generateStudentList(snameList, 10);
        
        

        
        System.out.println("LIST:");
        printCollection( snameList);
        snames.addAll(snameList);
        snames.add(new Student(1000000,"John","Smith"));
        snames.add(new Student(1000001,"John","Smith"));

        System.out.println("SET:");
        printCollection( snames);
        
        names.add(nameList.get(0).toUpperCase());
        
        int[] array = new int[10];
        TreeSet<Integer> nums = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            int r = (int) (Math.random() * 15);
            if (nums.contains(r)){
                continue;
            }else{
                array[i] = r;
                nums.add(r);
            }
            
        }
        for( int a : array) {
            System.out.print( a + " ");
        }
        
        

    }
    
}
