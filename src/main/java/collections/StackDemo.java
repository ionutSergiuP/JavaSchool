package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stivaMingi = new Stack<>();

        stivaMingi.push("Mingea1");
        stivaMingi.push("Mingea2");
        stivaMingi.push("Mingea3");

        stivaMingi.pop();

        for (String s : stivaMingi){
            System.out.println(s);
        }
    }

}
