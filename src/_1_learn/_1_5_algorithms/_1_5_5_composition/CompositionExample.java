package _1_learn._1_5_algorithms._1_5_5_composition;

import java.util.ArrayList;
import java.util.Collections;

public class CompositionExample {
    public static void main(String[] args) {
        frequency();
        disjointing();
    }

    private static void frequency() {
        ArrayList<String> numbers = new ArrayList<>();

//        Before
        numbers.add("1");
        numbers.add("2");
        numbers.add("1");
        numbers.add("3");
        numbers.add("1");
        numbers.add("4");
        System.out.println("Before Frequency: " + numbers);

//        After
        int count = Collections.frequency(numbers, "1");
        System.out.println("After Frequency : " + count + "\n");
    }

    private static void disjointing() {
        ArrayList<String> numbers = new ArrayList<>();

//        Before
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        System.out.println("Before disjoint: " + numbers);

        ArrayList<String> secondaryNumbers = new ArrayList<>();
        secondaryNumbers.add("5");
        secondaryNumbers.add("6");
        secondaryNumbers.add("7");

//        After
        boolean value = Collections.disjoint(numbers, secondaryNumbers);
        System.out.println("After disjoint : " + value);
    }
}