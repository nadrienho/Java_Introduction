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
        /*
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
        }*/
    List<Student> sList = new ArrayList<>();
    RandomLists.generateStudentList(sList, 20);
    System.out.println("LIST:");
    printCollection( sList);
    Map<Integer,Student> studentMap = new TreeMap<>();
    for( Student s : sList) {
	studentMap.put( s.id, s);
    }
    printCollection(studentMap.values()); 
    Map<String,List<Student>> courses = new TreeMap<>(); 
    courses.put( "Computer Science", new ArrayList<Student>());
    courses.put( "Information Technology", new ArrayList<Student>());
    courses.put( "Incompetent Government", new ArrayList<Student>());
    
    Iterator<String> keyIterator = courses.keySet().iterator();
    for( Student student : sList) {
	if ( !keyIterator.hasNext()) {
		keyIterator = courses.keySet().iterator();
	}
	List<Student> list = courses.get( keyIterator.next());
	list.add(student);
    }
    
    for( String course : courses.keySet()) {
	System.out.println( course);
	for( Student student : courses.get( course)) {
		System.out.println( "\t" + student);
	}
    }
    //each course stores it's students in a treeset using a studentNumberComparator
    
    Map<String,TreeSet<Student>> ncourses = new TreeMap<>();
    ncourses.put( "Computer Science", new TreeSet<Student>(new StudentNumberComparator()));
    ncourses.put( "Information Technology", new TreeSet<Student>(new StudentNumberComparator()));
    ncourses.put( "Incompetent Government", new TreeSet<Student>(new StudentNumberComparator()));
    
    Iterator<String> nkeyIterator = courses.keySet().iterator();
    for( Student student : sList) {
	if ( !nkeyIterator.hasNext()) {
		nkeyIterator = ncourses.keySet().iterator();
	}
	TreeSet<Student> nlist = ncourses.get( nkeyIterator.next());
	nlist.add(student);
    }
    
    for( String course : ncourses.keySet()) {
	System.out.println( course);
	for( Student student : ncourses.get( course)) {
		System.out.println( "\t" + student);
	}
    }
    
    // search for a student by number 
    // we take an id number of a known student for demonstration purposes only
    int idNumber = sList.get(sList.size() / 2).id;
    Student student = studentMap.get(idNumber);
    for(String course : courses.keySet()) {
	Collection<Student> members = courses.get( course);
	if ( members.contains( student)) {
		System.out.println( "Student " + idNumber + " is studying " +
					course + ".");
	}
}


    }
    
}
