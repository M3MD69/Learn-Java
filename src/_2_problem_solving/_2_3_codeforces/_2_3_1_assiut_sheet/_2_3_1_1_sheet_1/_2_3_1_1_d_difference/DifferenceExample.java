package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_d_difference;

import java.util.Scanner;

/**
 * <h1>D. Difference</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * Given four numbers A, B, C and D. Print the result of the following equation:
 * <br/>
 * X = ( A * B ) - ( C * D )
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1 2 3 4</h2>
 * <h1>Output:</h1>
 * <h2>Difference = -14</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2 3 4 5</h2>
 * <h1>Output:</h1>
 * <h2>Difference = -14</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4 5 2 3</h2>
 * <h1>Output:</h1>
 * <h2>Difference = 14</h2>
 */

public class DifferenceExample {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        long number1 = Integer.parseInt(input.next()),
                number2 = Integer.parseInt(input.next()),
                number3 = Integer.parseInt(input.next()),
                number4 = Integer.parseInt(input.next()),
                result = (number1 * number2) - (number3 * number4);
        System.out.print("Difference = " + result);
    }
}