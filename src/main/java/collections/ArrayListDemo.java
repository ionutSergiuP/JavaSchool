package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args){


        List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));

      Iterator<String> iterator = list.iterator();

      while (iterator.hasNext()){
          System.out.println(iterator.next());
      }
    }
}
