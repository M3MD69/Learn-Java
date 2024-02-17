package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_sheets._2_3_1_1_data_types_and_conditions._c_simple_calculator;

import java.util.Scanner;

/**
 * <h1>C. Simple Calculator</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 10</h2>
 * <h1>Output:</h1>
 * <h2>
 * 5 + 10 = 15
 * <br/>
 * 5 * 10 = 50
 * <br/>
 * 5 - 10 = -5
 * </h2>
 */

public class SimpleCalculatorExample {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        long number1 = Long.parseLong(input.next()),
                number2 = Long.parseLong(input.next());

        System.out.printf("%d + %d = %d\n", number1, number2, number1 + number2);
        System.out.printf("%d * %d = %d\n", number1, number2, number1 * number2);
        System.out.printf("%d - %d = %d", number1, number2, number1 - number2);
    }
}