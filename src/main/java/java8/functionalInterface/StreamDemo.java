package java8.functionalInterface;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String args[]) {
//        Stream.empty();
//
//        Stream.of("string1");
//
//        Stream.of("one", "two", "three");
//
//        IntStream stream = "hello".chars();
//
//        Stream<String> words = Pattern.compile("[^\\p{javaLetter}]")
//                .splitAsStream("Book of strings");
//
//        Stream<String> lines = Files.lines("");

//        Stream.Builder<String> builder = Stream.builder();
//
//        builder.add("one").add("two").add("three");
//        builder.accept("four");
//
//        Stream<String> stream = builder.build();

        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 18);
        Person person3 = new Person("Anderson", 65);
        Person person4 = new Person("Smith", 45);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

//        personList.stream()
//                .map(Person::getName)
//                .forEach(System.out::println);

// filtered by age
//        Predicate<String> myPredicate = (str1) -> str1.contains("s");

//        List<String> filteredList = personList.stream()
//                .filter(myPredicate)
//                .map(Person::getName)
//                .collect(Collectors.toList());

        //
        List<String> filteredList = personList.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.toList());

        List<String> filteredList2 = personList.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.toList());
//
//        filteredList.forEach(s -> System.out.println(s));

//         filtered by persons that name begin with A

        // using own comparator
        Comparator<Person> personComparator = Comparator.comparing(Person::getName);
//        List<String> filteredList = personList.stream()
//                .sorted(personComparator.reversed())
//                .map(Person::getName)
//                .collect(Collectors.toList());

        //using count
//        long countPersons = personList.stream()
//                .count();
//
//        System.out.println(countPersons);
//
//        //using match
//        boolean anyMatchPerson = personList.stream()
//                .anyMatch(person -> person.getName().contains("J"));
//
//        System.out.println("Any match:" + anyMatchPerson);
//
//        //using all match
//        boolean allMatchPerson = personList.stream()
//                .allMatch(person -> person.getAge() >= 18);
//
//        System.out.println("All match:" + allMatchPerson);
//
//        //using none match
//        boolean noneMatchPerson = personList.stream()
//                .noneMatch(person -> person.getName().equals("Cassian"));
//
//        System.out.println("None match: " + noneMatchPerson);
//
//        //using find
//
//        //find first
//        Optional<String> firstPersonName = personList.stream()
//                .sorted(personComparator.reversed())
//                .map(Person::getName)
//                .findFirst();
//
//        System.out.println("Find first: " + firstPersonName.get());
//
//        Optional<Person> firstPersonObject = personList.stream()
//                .sorted(personComparator.reversed())
//                .findFirst();
//
//        System.out.println(String.format("Find firsy person obj: %s %s ",firstPersonObject.get().getName(), firstPersonObject.get().getAge()));
//
//        //find any
//        Optional<String> anyPersonName = personList.stream()
//                .sorted(personComparator.reversed())
//                .map(Person::getName)
//                .findAny();
//
//        System.out.println("Find any person name: " + anyPersonName.get());


        //reduce
//        List<Integer> ageList = personList.stream()
//                .map(Person::getAge)
//                .collect(Collectors.toList());
//
//        int sumOfAge = ageList.stream()
//                .reduce(0, (age1, age2) -> Integer.sum(age1, age2));
//
//        System.out.println("Sum of ages : " + sumOfAge);

        Map<Integer, Person> personHashMap = new HashMap<>();

        personHashMap.put(1, person1);
        personHashMap.put(2, person2);
        personHashMap.put(3, person3);
        personHashMap.put(4, person4);

        personHashMap.entrySet().stream()
                .forEach(entry -> System.out.println(String.format("Person Map key: %s value: %s", entry.getKey(), entry.getValue().getName())));

        Map<Integer, Person> personMapFiltered = personHashMap.entrySet().stream()
                .filter(entry -> entry.getKey() > 2)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        personMapFiltered.forEach((key, personValue) ->
                System.out.println(String.format("Filtered Person Map by key: %s value: %s", key, personValue.getName())));

        Map<Integer, Person> personMapFilteredName = personHashMap.entrySet().stream()
                .filter(entry -> entry.getValue().getName().startsWith("A"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        personMapFilteredName.forEach((key, personValue) ->
                System.out.println(String.format("Filtered Person Map by name: %s value: %s", key, personValue.getName())));













    }
}
