package collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> spalatorieAuto = new PriorityQueue<>();

        spalatorieAuto.add("TM01CCC");
        spalatorieAuto.add("TM02DDD");
        spalatorieAuto.add("TM01EEE");


        Iterator<String> myIterator = spalatorieAuto.iterator();
        while (myIterator.hasNext()) {
            System.out.println("Se spala masina cu nr de inmatriculare: " + myIterator.next());
            myIterator.remove();

        }

        spalatorieAuto.poll();
        for (String s : spalatorieAuto) {
            System.out.println(s);
        }
        System.out.println("Au mai ramas la spalat nr de masini: " + spalatorieAuto.size());


        spalatorieAuto.poll();
        System.out.println("Au mai ramas: " + spalatorieAuto.size());


    }
}
