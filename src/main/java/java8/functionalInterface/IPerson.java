package java8.functionalInterface;

public interface IPerson {

    public default void printDefault(){
        System.out.println("Print from default");
    }

    public static void printStatic(){
        System.out.println("Print from static");
    }
}
