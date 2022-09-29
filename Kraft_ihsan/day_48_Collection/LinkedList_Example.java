package day_48_Collection;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class LinkedList_Example {
    public static void main(String[] args) {
//        LinkedList<String> linkedList=new LinkedList<>();
//        linkedList.add("ahmet");
//        linkedList.add("mehmet");
//        linkedList.add("ayşe");
//        linkedList.add("alpaslan");
//
//        System.out.println(linkedList.getLast());
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.pop());
//        System.out.println(linkedList);
//        System.out.println(linkedList.size());


//        Vector<String> vector=new Vector<>();
//        System.out.println("vector.capacity() = " + vector.capacity());
//        System.out.println("vector.size() = " + vector.size());

        Stack<Object> stack=new Stack<>();
        stack.add(true);
        stack.add(5);
        stack.add("Merhaba");
        stack.add('C');
        stack.add(8.8);
        System.out.println("stack = " + stack);

        System.out.println("stack.push(\"dünya\") = " + stack.push("dünya"));

        System.out.println("stack = " + stack);


    }
}
