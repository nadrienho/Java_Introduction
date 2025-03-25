/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;
import java.util.*;
import java.io.*;
import java.nio.file.*;
/**
 *
 * @author s4402831
 */
public class Hashing {
  private HashNode[] buckets;
  public Hashing(int buckets) {
    this.buckets = new HashNode[buckets];
  }
  
public Object put(Object key, Object value) {
    // compute bucket index by reducing the key's hash code value to fit array
    int bucketIndex = (int) Math.abs(key.hashCode() % this.buckets.length);
    if (this.buckets[bucketIndex] == null) {
      // if the bucket is empty, set a new HashNode with the key and value
      this.buckets[bucketIndex] = new HashNode(key, value);
      return null; // return null because there was no value for this key
    } else {
      HashNode node = this.buckets[bucketIndex];
      // iterate list of HashNodes until we find the key or the end of the list
      while(true) {
        if (node.key.equals(key)) {
          // if this node has the same key as being put
          // change the mapped value
          Object oldValue = value;
          node.value = value;
          return oldValue; // return the previous value
        } else if (node.next == null) {
          // if this is the last node in the list, add a new node as its next
          node.next = new HashNode(key, value);
          return null; // return null because there was no value for this key
        } else {
          // go on to the next node in the list
          node = node.next;
        }
      }
    }
  }

public Object get(Object key) {
    int hashCode = key.hashCode();
    int bucketIndex = (int) Math.abs(hashCode % this.buckets.length);
    HashNode node = this.buckets[bucketIndex];
    while(node != null) {
      if (node.key.equals(key)) {
        return node.value;
      } else {
        node = node.next;
      }
    }
    return null;
  }

public void summary() {
    for (int i = 0; i < this.buckets.length; i++) {
      int count = 0;
      HashNode node = this.buckets[i];
      while(node != null) {
        count++;
        node = node.next;
      }
      System.out.println("Bucket " + i + " contains " + count + " items.");
    }
  }
  
  public void detail() {
    for (int i = 0; i < this.buckets.length; i++) {
      System.out.print("Bucket " + i + " contains ");
      HashNode node = this.buckets[i];
      while(node != null) {
        System.out.print("'" + node.value + "' ");
        node = node.next;
      }
      System.out.println();
    }    
  }
public static void main(String[] args) throws IOException {
    //try{
        int buckets = 10;
        Hashing hashmap = new Hashing(buckets);

        List<String> lines = Files.readAllLines(new File("‪C\\Users\\s4402831\\Downloads\\countries.txt").toPath());
        for(int i = 1; i < lines.size(); i++) {
          String[] nameCode = lines.get(i).split(";");
          hashmap.put(nameCode[1], nameCode[0]);
        }

        hashmap.detail();
        hashmap.summary();

        System.out.println( "code for 'GB': " + hashmap.get("GB"));
    }
/*} catch (IOException e){
    System.err.println("ERROR reading this file: " + e.getMessage());
} catch (Exception e){
    System.err.println("ERROR occured: " + e.getMessage());
}*/



}
