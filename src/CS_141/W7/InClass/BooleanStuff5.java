package CS_141.W7.InClass;

import java.util.Scanner;
// 11/7/19 Doug Gilchrist [Rhyme/Alliteration Test]
public class BooleanStuff5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type two words: ");
        String word1 = console.next().toLowerCase();
        String word2 = console.next().toLowerCase();

        if (rhyme(word1, word2)) {
            System.out.println("They rhyme!");
        }
        if (alliterate(word1, word2)) {
            System.out.println("They alliterate!");
        }
    }

    // Returns true if s1 and s2 end with the same two letters.
    public static boolean rhyme(String s1, String s2) {
        return s2.length() >= 2 && s1.endsWith(s2.substring(s2.length() - 2));
    }

    // Returns true if s1 and s2 start with the same letter.
    public static boolean alliterate(String s1, String s2) {
        return s1.startsWith(s2.substring(0, 1));
    }

}
