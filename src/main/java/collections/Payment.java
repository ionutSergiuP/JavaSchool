package collections;

import java.util.ArrayList;
import java.util.List;

public class Payment<T> {
    private List<T> payments;

    public Payment(List<T> payments){
        this.payments = payments;
    }
//
//    public List<?> getPayments() {
//        return payments;
//    }

    public <T> void displayList(List<T> list){

        for(T element : list){
            System.out.println(element);
        }
    }
}
