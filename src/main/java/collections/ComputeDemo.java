package collections;

public class ComputeDemo {
    public static void main(String[] args) {
        Numbers<Integer> numbers = new Numbers<>(100, 200);
        Numbers<Float> numbers2 = new Numbers<>(10.2f, 20.2f);

        Integer sum = numbers.getNumber1() + numbers.getNumber2();
        Float sumFloat = numbers2.getNumber1() + numbers2.getNumber2();
        System.out.println("Sum of numbers : " + sum);
        System.out.println("Sum of numbers float : " + sumFloat);
    }
}
