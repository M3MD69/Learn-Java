package _2_problem_solving._2_1_w3schools._2_1_1_how_to._2_1_1_2_count_words;

public class CountWords {
    public static void main(String[] args) {
        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}