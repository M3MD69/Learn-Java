package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_12_question_12;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that takes three numbers as input to calculate and print the average of the numbers.</h2>
 */

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter Number 2: ");
        int number2 = input.nextInt();

        System.out.print("Enter Number 3: ");
        int number3 = input.nextInt(),
                averageOfThreeNumbers = (number1 + number2 + number3) / 3;
        System.out.print("Average of Three Numbers: " + averageOfThreeNumbers);
    }
}