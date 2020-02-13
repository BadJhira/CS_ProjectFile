package CS_141.W6.W6PracticeIt;

import java.util.Scanner;

public class VowelBullshit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    }

    public static boolean isVowel(String letter) {
        letter = letter.toLowerCase();
        boolean vowel = false;
        if (letter.equals("a") ||
            letter.equals("e") ||
            letter.equals("i") ||
            letter.equals("o") ||
            letter.equals("u")) {
            vowel = true;
        }
        return vowel;
    }
}
