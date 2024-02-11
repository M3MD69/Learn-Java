package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_104_question_104;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an array from a given array of integers. The newly created array will contain the elements from the given array before the last element value of 10.</h2>
 */

public class Question104 {
    public static void main(String[] args) {
        int[] ORIGINAL_ARRAY = {11, 15, 13, 10, 45, 20, 33, 53},
                NEW_ARRAY = addElementsBeforeSpecificNumberToNewArray(ORIGINAL_ARRAY, 10),
                NEW_ARRAY_2 = addElementsBeforeSpecificNumberToNewArray_Solution2(ORIGINAL_ARRAY, 10); // > Solution 2

        System.out.println("Original Array           : " + Arrays.toString(ORIGINAL_ARRAY));
        System.out.println("New Array                : " + Arrays.toString(NEW_ARRAY));
        System.out.print("New Array with Solution 2: " + Arrays.toString(NEW_ARRAY_2));
    }

    private static int[] addElementsBeforeSpecificNumberToNewArray(final int[] ORIGINAL_ARRAY, final int SPECIFIC_NUMBER) {
        int length = 0;
        for (int index = 0; index < ORIGINAL_ARRAY.length; index++)
            if (ORIGINAL_ARRAY[index] == SPECIFIC_NUMBER) {
                length = index;
                break;
            }
        int[] newArray = new int[length];
        for (int index = 0; index < length; index++) newArray[index] = ORIGINAL_ARRAY[index];
        return newArray;
    }

    private static int[] addElementsBeforeSpecificNumberToNewArray_Solution2(final int[] ORIGINAL_ARRAY, final int SPECIFIC_NUMBER) {
        int length = 0;
        for (int index = 0; index <= ORIGINAL_ARRAY.length; index++)
            if (ORIGINAL_ARRAY[index] == SPECIFIC_NUMBER) {
                length = index;
                break;
            }
        int[] newArray = new int[length];
        System.arraycopy(ORIGINAL_ARRAY, 0, newArray, 0, length);
        return newArray;
    }
}