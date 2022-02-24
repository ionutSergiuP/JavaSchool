package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        List<Integer> paymentsList = new ArrayList<>();
        paymentsList.add(100);
        paymentsList.add(200);
        paymentsList.add(300);

        Payment<Integer> paymentInt = new Payment<>(paymentsList);

        List<Float> paymentsFloat = new ArrayList<>();
        paymentsFloat.add(123.34f);
        paymentsFloat.add(243.56f);

        Payment<Float> paymentFloat = new Payment<>(paymentsFloat);

//        List<Number> paymentIntN = new ArrayList<>(paymentInt.getPayments());
//        List<Number> paymentFloatN = new ArrayList<>(paymentFloat.getPayments());
//
//        List<Number> mergedList = Payment.mergeMultipleLists(paymentIntN, paymentFloatN, paymentIntN, paymentIntN);

//        displayAllPayments(mergedList);
//        displayAllPayments(paymentInt.getPayments());
//        displayAllPayments(paymentFloat.getPayments());
    }

    public static <T> void displayAllPayments(List<T> list){
        System.out.println("Payments");
        for(T element : list){
            System.out.println(String.format("Plata: %s RON", element));
        }
    }
}
