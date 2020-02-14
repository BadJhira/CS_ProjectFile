package CS_202.W6.PracticeIt;

public class BJP5_12_14 {
    public static void main(String[] args) {
        System.out.println(dedup("boookkkeeeperrrr"));
    }

    public static String dedup(String string) {
        if (string.length() < 2)
            return string;
        else if (!string.substring(0, 1).equals(string.substring(1, 2)))
            return string.substring(0, 1) + dedup(string.substring(1));
        else
            return dedup(string.substring(1));
    }
}
