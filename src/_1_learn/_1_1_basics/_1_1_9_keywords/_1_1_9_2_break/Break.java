package _1_learn._1_1_basics._1_1_9_keywords._1_1_9_2_break;

public class Break {
    public static void main(String[] args) {
        int number = 5;
        int index = 0;

        while (true) {
            System.out.println(index);
            ++index;
            if (number == index) {
                System.out.println(number + " Done Stopped");
                break; /* Stops all blocks with break in them! */
            }
        }
    }
}