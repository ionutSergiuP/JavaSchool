package collections;

public class Numbers<T> {
    private T number1;
    private T number2;

    public Numbers(T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public T getNumber1(){
        return number1;
    }

    public T getNumber2(){
        return number2;
    }
}
