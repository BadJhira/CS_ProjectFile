package CS_141.W7.InClass;
// 11/7/19 Doug Gilchrist [Test for Vowels]
public class BooleanStuff6 {
    public static void main (String[] args) {

        System.out.println(isVowel("J"));
        System.out.println(isNotVowel("J"));
    }

    public static boolean isVowel(String s) {
        return  s.equalsIgnoreCase("a") ||
                s.equalsIgnoreCase("e") ||
                s.equalsIgnoreCase("i") ||
                s.equalsIgnoreCase("o") ||
                s.equalsIgnoreCase("u");
    }

    public static boolean isNotVowel(String s) {
        return  !s.equalsIgnoreCase("a") ||
                !s.equalsIgnoreCase("e") ||
                !s.equalsIgnoreCase("i") ||
                !s.equalsIgnoreCase("o") ||
                !s.equalsIgnoreCase("u");
    }
}
