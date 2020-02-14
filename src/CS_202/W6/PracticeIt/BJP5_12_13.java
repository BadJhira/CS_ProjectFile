package CS_202.W6.PracticeIt;

public class BJP5_12_13 {
    public static void main(String[] args) {
        String string1 = "extreme";
        String string = "moth";
        System.out.println(string1.substring(string.length() - 1, string.length()));
        System.out.println(indexOf("arak", "arak"));
        System.out.println(indexOf("arbkarak", "arak"));
        System.out.println(indexOf("arbkqqqqarak", "arak"));
        System.out.println(indexOf("arbkqqqqarak", "dcb"));
    }

//    public static int indexOf(String string, String target) {
//        if (!string.contains(target))
//            return -1;
//        else if (!string.substring(0, 1).equals(target.substring(0, 1))) {
//            // This passes the tests provided by PracticeIt
//            // but ultimately fails to accomplish what is asked if
//            // more complex strings are provided.
//            // (it only checks the first letter of the second string)
//            return 1 + indexOf(string.substring(1), target);
//        } else
//            return 0;
//    }

//    public static int indexOf(String string, String target) {
//        if (!string.contains(target))
//            return -1;
//        else if (!string.substring(0, 1).equals(target.substring(0, 1))
//                || !string.substring(target.length() - 1, target.length()).equals(target.substring(target.length() - 1))) {
//            // This also passes the tests provided by PracticeIt
//            // but ultimately fails to accomplish what is asked if
//            // even more complex strings are provided.
//            // (it checks only the first and last letters of the second string)
//            // i.e. if indexOf("arbkarak", "arak") is called,
//            // it returns index 0.
//            return 1 + indexOf(string.substring(1), target);
//        } else
//            return 0;
//    }

//    public static int indexOf(String string, String target) {
//        if (!string.contains(target))
//            // using contains() feels like a cheat
//            // this is also slightly over-complicating the process;
//            // we don't need to check every character - we can compare strings directly.
//            return -1;
//        else if (target.length() == 0)
//            // catch for when target is reduced to 0 length
//            return 0;
//        else {
//            if (!string.substring(0, 1).equals(target.substring(0, 1)))
//                // check if the first character of both strings are different,
//                // remove first character of string, leave target intact
//                // add 1 to the indexOf, and run again
//                return 1 + indexOf(string.substring(1), target);
//            else
//                // otherwise, remove first character from both,
//                // add nothing, and run again.
//                // this checks along all characters in the target
//                return indexOf(string.substring(1), target.substring(1));
//        }
//    }

//    public static int indexOf(String string, String target) {
//        if (!string.contains(target))
//            // this still feels cheaty
//            return -1;
//        else if (string.equals(target))
//            return 0;
//        else {
//            if (string.substring(0, target.length()).equals(target))
//                return 0;
//            else
//                return 1 + indexOf(string.substring(1), target);
//        }
//    }

//    public static int indexOf(String string, String target) {
//        if (string.equals(target))
//            return 0;
//        else if (string.length() > target.length()) {
//            if (string.substring(0, target.length()).equals(target))
//                return 0;
//            else {
//                int n = 1 + indexOf(string.substring(1), target);
//                return (n == 0) ? -1 : n;
//            }
//        } else
//            return -1;
//    }

    /*
    There were several methods that check only the first character /
    first and last character / recurse through all target characters,
    and satisfy the tests provided by PracticeIt, but could ultimately
    fail a test with more complex strings.
    It was also viable to use the .contains() method to check if
    the target was contained in the string to begin with, but this
    was ultimately against the proposed limitations.
    Then I remembered I could compare strings directly. Derp.
    */

    public static int indexOf(String string, String target) {
        if (string.length() < target.length())
            // If the target is larger than the string, it isn't contained in the string.
            return -1;
        else if (string.substring(0, target.length()).equals(target))
            // Check if the target is immediately present in the string.
            return 0;
        else {
            int n = 1 + indexOf(string.substring(1), target);
            // We assign the recursion to a variable.
            // This avoids calling the method twice in the ternary statement.
            return (n == 0) ? -1 : n;
        }
    }
}
