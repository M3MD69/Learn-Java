package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_88_question_88;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get the current system environment and system properties.</h2>
 */

public class Question88 {
    public static void main(String[] args) {
        System.out.println("Current System Environment:\n" + System.getenv());
        System.out.print("\nSystem Properties:\n" + System.getProperties());
    }
}