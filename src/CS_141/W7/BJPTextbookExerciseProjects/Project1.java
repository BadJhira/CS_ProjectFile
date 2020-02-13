package CS_141.W7.BJPTextbookExerciseProjects;

import java.util.Scanner;
// 11/6/19 Doug Gilchrist [Week 7 BJP Textbook Exercises] Project 1
public class Project1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        pigLatinProject(console);
    }

    /*
    Modify this to accept full sentences
     */

    public static void pigLatinProject(Scanner console) {
        System.out.println("This program takes your input at turns it into Pig Latin!");
        System.out.print("Type a word: ");
        String string = console.nextLine();
        // get input from user
        int index = getFirstVowel(string);
        // get the index of the first vowel
        while (!string.isEmpty()) {
            // while the user input is not blank
            if (index > 0) {
                // if the index of the first vowel is not at 0, pigLatinize
                string = pigLatinize(string, index);
            } else {
                // if the index of the first vowel *is* at 0, just add '-ay'
                string += "-ay";
            }
            System.out.println(string);
            // print the now pigLatinized string

            System.out.print("Type a word: ");
            string = console.nextLine();
            // get new input from the user
            index = getFirstVowel(string);
            // get the index of the first vowel
        }
        System.out.println("Program complete!");
    }

    public static String pigLatinize(String string, int index) {
        String syllable = string.substring(0, index);
        // takes the first consonant-sound syllable
        string = string.substring(index) + "-" + syllable + "ay";
        // rebuilds the string with syllable placed at the back plus 'ay'
        return string;
        // returns with the new string
    }

    public static int getFirstVowel(String string) {
        String vowels = "aeiou";
        // string of vowels to check against (will probably be replaced by an array in the future)
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if (vowels.contains(Character.toString(string.charAt(i)))) {
                return i;
                // returns int i if string contains a vowel at index i
            }
        }
        return -1;
        // otherwise returns -1
    }
}
