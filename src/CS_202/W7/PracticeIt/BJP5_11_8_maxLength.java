package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_8_maxLength {
    public static void main(String[] args) {

    }

    public static int maxLength(Set<String> set) {
        int length = 0;
        for (String string : set) {
            if (string.length() > length)
                length = string.length();
        }
        return length;
    }
}
