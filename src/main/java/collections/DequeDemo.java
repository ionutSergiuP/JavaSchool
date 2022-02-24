package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<String> myDeque = new ArrayDeque<>();

        myDeque.add("1");
        myDeque.add("2");
        myDeque.add("3");
        myDeque.add("4");
        myDeque.add("5");

        myDeque.removeFirst();
        myDeque.removeLast();


        System.out.println(myDeque.isEmpty());
//
//        for (String s: myDeque){
//            System.out.println(s);
//        }
    }
}
