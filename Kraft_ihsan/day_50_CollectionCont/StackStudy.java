package day_50_CollectionCont;

import java.util.Arrays;
import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {

        Stack<Integer> stc=new Stack<>();
        //push()-peek()-pop()
        stc.addAll(Arrays.asList(2,4,6,7,8));
        System.out.println("stc = " + stc);

        stc.push(1);
        System.out.println("stc = " + stc);//LIFO-stc = [2, 4, 6, 7, 8, 1]
        stc.push(11);
        System.out.println("stc = " + stc);

        //pop()
        System.out.println("stc.pop() = " + stc.pop());//pop metodu remove yapar, değeri döndürür.
//        int i=stc.pop();
//        System.out.println("i = " + i);
        System.out.println("stc = " + stc);

        //peek()
        System.out.println("stc.peek() = " + stc.peek());//stc.peek() = 1

        //search()//stc = [2, 4, 6, 7, 8, 1]
        System.out.println("stc.search(1) = " + stc.search(1));//1 verir. peek sırasını veriyor.
        System.out.println("stc.search(8) = " + stc.search(8));//2 verir.
        System.out.println("stc.search(55) = " + stc.search(11));// yoksa -1 verir.

    }
}
