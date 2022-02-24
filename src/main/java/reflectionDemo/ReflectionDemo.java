package reflectionDemo;

import collections.Payment;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionDemo {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        List<Integer> paymentsList = new ArrayList<>();
        paymentsList.add(100);
        paymentsList.add(200);
        paymentsList.add(300);


        Payment<Integer> paymentInt = new Payment<>(paymentsList);

        Class c = paymentInt.getClass();

        System.out.println();
        for (Field field : c.getDeclaredFields()){
            field.setAccessible(true);
            Object obj = field.get(paymentInt);
            System.out.println(obj);
        }

        List<String> foreginList = new ArrayList<>();
        foreginList.add("A");
        foreginList.add("B");
        foreginList.add("C");

        Object[] params = new Object[]{foreginList};

        for(Method method : c.getDeclaredMethods()){
            System.out.println(method);
           method.invoke(paymentInt, params);
        }
    }
}
