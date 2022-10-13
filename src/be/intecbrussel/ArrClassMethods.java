package be.intecbrussel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrClassMethods {

    public static void main(String[] args) {

        int[] originalArr = { 10, -20, 33, 9, 97, -65, 345 };

        System.out.println(Arrays.toString(originalArr));
//        Arrays.sort(originalArr);
//        System.out.println(Arrays.toString(originalArr));

        int[] compleetNewArr = Arrays.copyOf(originalArr, 20);

        int[] newArray = Arrays.copyOfRange(originalArr, 2, 4);

        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(compleetNewArr));

        Arrays.fill(compleetNewArr, 7, 20, 1000);

        System.out.println(Arrays.toString(compleetNewArr));
    }

}
