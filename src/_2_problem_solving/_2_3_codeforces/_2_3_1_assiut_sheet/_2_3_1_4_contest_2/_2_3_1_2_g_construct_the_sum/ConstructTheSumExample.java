package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_2_g_construct_the_sum;

import java.util.Scanner;

/**
 * <h1>G. Construct the Sum</h1>
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
 * <h1>Question:</h1>
 * <h2>You are given two integers n and s, and you have to find distinct positive integers, such that each of them is ≤ n, and their summation =s. Otherwise, state that this is impossible.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 5 3
 * <br/>
 * 7 10
 * <br/>
 * 6 4
 * <br/>
 * 2 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2 1
 * <br/>
 * 4 3 2 1
 * <br/>
 * 3 1
 * <br/>
 * -1
 * </h2>
 */

public class ConstructTheSumExample {
    public static void main(String[] args) {
        inputValues();
    }

    private static void inputValues() {
        final Scanner INPUT = new Scanner(System.in);
        byte length = INPUT.nextByte();
        while (length-- > 0) {
            calculateNumbers(INPUT.nextInt(), INPUT.nextLong());
            if (length > 0) System.out.println();
        }
        INPUT.close();
    }

    private static void calculateNumbers(final int FIRST_NUMBER, final long SECOND_NUMBER) {
        if ((FIRST_NUMBER * (FIRST_NUMBER + 1L) / 2) < SECOND_NUMBER) System.out.print(-1);
        else {
            final int[] NUMBERS = new int[FIRST_NUMBER];
            int counter = 0;
            for (int index = 1, sum = 0; index <= FIRST_NUMBER; index++) {
                if (sum + index <= SECOND_NUMBER) {
                    sum += index;
                    NUMBERS[counter++] = index;
                } else {
                    sum = sum - (index - 1);
                    sum += index;
                    NUMBERS[counter - 1] = index;
                }
                if (sum == SECOND_NUMBER) break;
            }
            printNumbers(NUMBERS);
        }
    }

    private static void printNumbers(final int[] NUMBERS) {
        for (int number : NUMBERS)
            if (number != 0) System.out.print(number + " ");
            else break;
    }
}