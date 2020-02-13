package CS_141.W7.BJPTextbookExerciseProjects;

import java.util.Scanner;
// 11/7/19 Doug Gilchrist [Week 7 BJP Textbook Exercises] Project 1
public class Project1Sentences {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        pigLatinProject(console);
    }

    public static void pigLatinProject(Scanner console) {
        System.out.println("This program takes your input at turns it into Pig Latin!");
        System.out.print("Type something: ");
        String string = console.nextLine();
        while (!string.isEmpty()) {
            // while the user input is not blank
            string = sentenceBreaker(string);
            // send the string to be (if necessary) broken apart & pigLatinized
            System.out.println(string);
            // print the now pigLatinized string
            System.out.print("Type something: ");
            string = console.nextLine();
            // get new input from the user
        }
        System.out.println("Program complete!");
    }

    public static String sentenceBreaker(String string) {
        if (!string.contains(" ")) {
            // if there are no spaces, just pigLatinize the word and return it
            return pigLatinize(string);
        } else {
            // otherwise, if there are spaces, break the words out
            String newString = "";
            while (string.contains(" ")) {
                // as long as the string has spaces, chop it up
                String word = string.substring(0, string.indexOf(" "));
                // find the first word in the string
                string = string.substring(string.indexOf(" ") + 1);
                // remove the first word from the string
                word = pigLatinize(word);
                // pigLatinize the first word
                newString += word + " ";
                // add the pigLatinized word to a new string
            }
            string = pigLatinize(string);
            // once the string has run out of spaces, pigLatinize the final word
            newString += string;
            return newString;
            // return the new, pigLatinized string
        }
    }

    public static String pigLatinize(String string) {
        int index = getFirstVowel(string);
        if (index > 0) {
            // if the word does NOT start with a vowel
            String syllable = string.substring(0, index);
            // takes the first consonant-sound syllable
            string = string.substring(index) + "-" + syllable + "ay";
        } else {
            // if the word DOES start with a vowel
            string += "-ay";
        }
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
