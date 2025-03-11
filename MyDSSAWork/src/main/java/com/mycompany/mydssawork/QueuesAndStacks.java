/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydssawork;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author s4402831
 */
public class QueuesAndStacks {
    public QueuesAndStacks() {
    }

    public static void main(String[] args) {
        System.out.println("First a Queue: ");
        Queue<String> q = new LinkedList();
        String[] data = new String[]{"tom", "Jerry", "Sylvester"};
        String[] var3 = data;
        int var4 = data.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String e = var3[var5];
            q.add(e);
        }

        System.out.println(q);
        String item = (String)q.remove();
        System.out.println("Removed " + item);
        System.out.println(q);
        q.add("goofy");
        q.add("pluto");
        System.out.println(q);

        while(!q.isEmpty()) {
            System.out.println((String)q.remove());
        }

        System.out.println("Now a stack");
        Deque<String> s = new LinkedList();
        String[] var11 = data;
        int var12 = data.length;

        for(int var7 = 0; var7 < var12; ++var7) {
            String e = var11[var7];
            s.push(e);
        }

        System.out.println(s);
        item = (String)s.pop();
        System.out.println("Popped: " + item);
        System.out.println(s);
        s.push("goofy");
        s.push("pluto");
        System.out.println(s);

        while(!s.isEmpty()) {
            System.out.println((String)s.pop());
        }

    }
}
