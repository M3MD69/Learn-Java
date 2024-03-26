package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_e_base_conversion;

import java.util.Scanner;

/**
 * <h1>E. Base Conversion</h1>
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
 * <h2>Given a number N. Print the binary equivalent of N. </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 10
 * <br/>
 * 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 1010
 * <br/>
 * 11
 * </h2>
 */

public class BaseConversionExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        inputValuesRecursion(INPUT.nextInt());
    }

    private static void inputValuesRecursion(int countOfTestCases) {
        if (countOfTestCases-- > 0) {
            printConvertFromDecimalToBinaryNumber(INPUT.nextInt());
            inputValuesRecursion(countOfTestCases);
        }
    }

    private static void printConvertFromDecimalToBinaryNumber(final int DECIMAL_NUMBER) {
        if (DECIMAL_NUMBER == 0) return;
        printConvertFromDecimalToBinaryNumber(DECIMAL_NUMBER / 2);
        System.out.print(DECIMAL_NUMBER % 2);
    }
}