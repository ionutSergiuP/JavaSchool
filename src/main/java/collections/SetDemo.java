package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> mySet = new TreeSet<>();

        mySet.add("D");
        mySet.add("AAAAAAAAAAAA");
        mySet.add("C");
        mySet.add("C");
        mySet.add("C");
        mySet.add("BBBBBdsas");
        mySet.add("B");
        mySet.add("B");

        for(String s : mySet){
            System.out.println(s + ": " + s.hashCode());

        }

    }
}
