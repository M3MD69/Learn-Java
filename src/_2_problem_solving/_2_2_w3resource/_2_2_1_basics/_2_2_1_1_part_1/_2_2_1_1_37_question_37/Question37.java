package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_37_question_37;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to reverse a string.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a string: The quick brown fox</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Reverse string: xof nworb kciuq ehT</h2>
 */

public class Question37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        char[] text = input.nextLine().toCharArray();

        System.out.print("Reverse string: ");
        for (int index = text.length - 1; index >= 0; index--) System.out.print(text[index]);
    }
}