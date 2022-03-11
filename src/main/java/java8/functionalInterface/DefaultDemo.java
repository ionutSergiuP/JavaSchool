package java8.functionalInterface;

public class DefaultDemo implements IPerson {
    public static void main(String args[]) {
        DefaultDemo defDemo = new DefaultDemo();

        defDemo.printDefault();
        IPerson.printStatic();
    }
}
