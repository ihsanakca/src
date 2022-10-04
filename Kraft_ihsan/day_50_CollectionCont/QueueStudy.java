package day_50_CollectionCont;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<Integer> numQue=new LinkedList<>();
        numQue.offer(1);
        numQue.offer(2);
        numQue.offer(4);
        numQue.offer(7);
        numQue.offer(8);
        numQue.offer(9);
        System.out.println("numQue = " + numQue);

        //remove()
        System.out.println("numQue.remove() = " + numQue.remove());//FIFO ilk giren ilk çıkar.
        System.out.println("numQue = " + numQue);

        //peek()
        System.out.println("numQue.peek() = " + numQue.peek());

        //element()
        System.out.println("numQue.element() = " + numQue.element());//sırada element yoksa exception veriri. peek de atmaz.
        System.out.println("numQue = " + numQue);

        while (!numQue.isEmpty()){
            System.out.print("numQue.poll() = " + numQue.poll()+"--->");
//         System.out.println(numQue.element());//exception
            System.out.println( numQue.peek());//null
        }
        System.out.println("numQue = " + numQue);
        System.out.println("numQue.poll() = " + numQue.poll());//null
//        System.out.println("numQue.remove() = " + numQue.remove());//exception


    }
}
