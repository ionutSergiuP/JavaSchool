package java8.functionalInterface;


import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class LambdaExpressions {

    Supplier<String> mySupplier = () -> "From supplier";

    Consumer<String> myConsumer = (str) -> {
        System.out.println("Begin to print....");
        System.out.println(str);
    };

    Consumer<String> myConsumerMethodRef = System.out::println;

    BiConsumer<String, String> myBiConsumer = (arg1, arg2) -> System.out.println(String.format("Message from biconsumer: arg1=%s arg2=%s", arg1, arg2));

    Predicate<String> myPredicate = (str1) -> str1.contains("s");

    BiPredicate<String, Integer> myBiPredicate = (str, i) -> str.contains(String.valueOf(i));

    Function<Integer, String> myFunction = (i) -> String.valueOf(i);

    BiFunction<Integer, Integer, String> myBifunction = (i1, i2) -> String.valueOf(i1).concat(String.valueOf(i2));

    UnaryOperator<String> myUnaryOperator = (str) -> StringUtils.capitalize(str);

    BinaryOperator<String> myBinaryOperator = (str1, str2) -> str1.concat(str2);

    public static void main(String args[]) {

        Comparator<Integer> myComparator = (i1, i2) -> Integer.compare(11, 22);
        Comparator<Integer> myComparatorMethodRef = Integer::compare;

        LambdaExpressions lambdaExpressions = new LambdaExpressions();

        System.out.println(lambdaExpressions.mySupplier.get());

        lambdaExpressions.myConsumer.accept("Message from Consumer");
        lambdaExpressions.myConsumerMethodRef.accept("Message from Consumer using Method references");

        lambdaExpressions.myBiConsumer.accept("John", "Smith");

        System.out.println(lambdaExpressions.myPredicate.test("Rate"));
        System.out.println(lambdaExpressions.myPredicate.test("Ssss"));

        System.out.println(lambdaExpressions.myBiPredicate.test("Hagi 10", 10));

        String resultStr = lambdaExpressions.myFunction.apply(20);
        System.out.println(resultStr);

        System.out.println(lambdaExpressions.myUnaryOperator.apply("small"));

        System.out.println(lambdaExpressions.myBinaryOperator.apply("John " , "Smith"));


    }

    public void sortJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void sortJava8(List<String> names){
        Collections.sort(names, (o1, o2) -> o1.compareTo(o2));
    }

//    public static String myPrinter(){
//        return "From supplier";
//    }
}
