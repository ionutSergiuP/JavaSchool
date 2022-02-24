package collections;


import java.util.*;
import java.util.Collections;

public class CollectionsDemo {


    public static void main(String[] args) {
        List<String> listaCumparaturi = new ArrayList<>();

        listaCumparaturi.add("Rosii");
        listaCumparaturi.add("Cartofi");
        listaCumparaturi.add("Suc");
        listaCumparaturi.add("Rosii");
        listaCumparaturi.add("Paine");
        listaCumparaturi.add("Paine");

        String s = listaCumparaturi.get(2);

        Collections.sort(listaCumparaturi, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        //listaCumparaturi.sort(Comparator.naturalOrder());

//       listaCumparaturi.sort(new Comparator<String>() {
//           @Override
//           public int compare(String o1, String o2) {
//               return o2.compareTo(o1);
//           }
//       });


//       Set<String> listCumparaturiValoriUnice = new HashSet<>(listaCumparaturi);

//       listaCumparaturi.add(1, "Suc");


//       removeByIndex(listaCumparaturi, "Suc");
//       removeByIndex(listaCumparaturi, "Castraveti");

//       listaCumparaturi.clear();
//
//       listaCumparaturi.add("Castraveti");

        System.out.println("-------------------------");

        for (Object prod : listaCumparaturi) {
            System.out.println(prod);
        }

    }

    public static void ifExistRemove(List<String> lista, String produs) {
        if (lista.contains(produs)) {
            lista.remove(produs);
        } else {
            System.out.println("Produsul :" + produs + " nu exista in lista");
        }
    }

    public static void removeByIndex(List<String> lista, String produs) {
        int indexToRemove = lista.indexOf(produs);
        if (indexToRemove >= 0) {
            lista.remove(indexToRemove);
        } else {
            System.out.println("Produsul :" + produs + " nu exista in lista");
        }

    }
}
