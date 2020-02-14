package CS_202.W6.PracticeIt;

public class BJP5_12_12 {
    public static void main(String[] args) {
        System.out.println(isReverse("behemoth", "htomeheb"));
    }

    public static boolean isReverse(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;
        else if (string1.length() == 0) {
            return true;
        } else {
            if (string1.substring(0, 1).equalsIgnoreCase(string2.substring(string2.length() - 1)))
                return isReverse(string1.substring(1), string2.substring(0, string2.length() - 1));
            else
                return false;
        }
    }
}
