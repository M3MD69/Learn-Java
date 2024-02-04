package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_16_question_16;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to print a face.</h2>
 * <br/>
 * <h1>Sample Pattern:</h1>
 */
/*
 +"""""+
[| o o |]
 |  ^  |
 | '-' |
 +-----+
*/

public class Question16 {
    public static void main(String[] args) {
        final String SHAPE = """
                 +""\"""+
                [| o o |]
                 |  ^  |
                 | '-' |
                 +-----+
                """;

        System.out.print(SHAPE);
    }
}