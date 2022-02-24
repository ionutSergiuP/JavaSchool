package collections;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> myPhoneAgenda = new HashMap<>();

        myPhoneAgenda.put("0720000045", "John Smith");
        myPhoneAgenda.put("0720000046", "Alan");
        myPhoneAgenda.put("0720000047", "Jennifer");
        myPhoneAgenda.put("0720000048", "John Wick");

        Map<String, String> myPhoneAgenda2 = new HashMap<>();
        myPhoneAgenda.put("0720000045", "Claudiu");
        myPhoneAgenda.put("0720000046", "Popescu");

        myPhoneAgenda.putAll(myPhoneAgenda2);


        for(Map.Entry<String, String> entry : myPhoneAgenda.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
