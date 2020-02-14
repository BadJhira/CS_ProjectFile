package CS_202.W6.PracticeIt;

public class BJP5_12_1 {
    public static void main(String[] args) {
        System.out.println(starString(4));
    }

//    public static String starString(int n) {
//        if (n < 0)
//            throw new IllegalArgumentException();
//        else if (n == 0)
//            return "*";
//        else {
//            String string = "";
//            for (int i = 0; i < Math.pow(2, n); i++) {
//                string += "*";
//            }
//            return string;
//        }
//    }

    public static String starString(int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        else if (n == 0)
            return "*";
        else {
            return starString(n - 1) + starString(n - 1);
        }
    }
}
