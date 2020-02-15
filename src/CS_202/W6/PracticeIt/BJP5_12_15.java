package CS_202.W6.PracticeIt;

import java.util.ArrayList;

public class BJP5_12_15 {
    public static void main(String[] args) {
        System.out.println(vowelsToEnd("beautifully"));
    }

    public static String vowelsToEnd(String string) {
        if (string.length() < 2)
            return string;
        else if (!"aeiou".contains(string.substring(0, 1)))
            return string.substring(0, 1) + vowelsToEnd(string.substring(1));
        else
            return vowelsToEnd(string.substring(1)) + string.substring(0, 1);
    }
}
