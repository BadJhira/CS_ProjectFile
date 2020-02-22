package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_10_removeEvenLength {
    public static void main(String[] args) {

    }

//    public static void removeEvenLength(Set<String> set) {
//         for (String string : set) {
//             // this throws a ConcurrentModificationException
//             // doesn't like removing things in a forEach
//             if (string.length() % 2 == 0)
//                 set.remove(string);
//         }
//    }

//    public static void removeEvenLength(Set<String> set) {
//        set.removeIf(string -> string.length() % 2 == 0);
//    }

    public static void removeEvenLength(Set<String> set) {
        Set<String> tempSet = new HashSet<>(set);
        for (String string : tempSet) {
            if (string.length() % 2 == 0)
                set.remove(string);
        }
    }
}
