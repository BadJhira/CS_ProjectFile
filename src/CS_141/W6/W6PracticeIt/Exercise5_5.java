package CS_141.W6.W6PracticeIt;

import java.util.Random;

public class Exercise5_5 {
    public static void main(String[] args) {

        randomLines();
    }

    public static void randomLines() {
        Random rand = new Random();
        int numLines = rand.nextInt(6) + 5;

        int length = rand.nextInt(81);
        char letter = (char)(rand.nextInt(26) + 97);
        String string = "";
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= length; j++) {
                string += letter;
                letter = (char)(rand.nextInt(26) + 97);
            }
            System.out.println(string);
            length = rand.nextInt(81);
            string = "";
        }
    }
}
