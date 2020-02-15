package CS_202.W6.PracticeIt;

public class BJP5_12_21 {
    public static void main(String[] args) {
//        countBinary(2, 2);
        countBinary(3);
    }

//    public static void countBinary(int bits) {
//        if (bits == 0)
//            System.out.print("");
//        else {
//            int bytes = (int)Math.pow(2, bits);
//            System.out.print(stringBinary(bytes, bytes, bits, bits));
//        }
//    }
//
//    private static String stringBinary(int bytes, int maxBytes, int bits, int maxBits) {
//        if (bytes == 1 && bits == 1)
//            return "1\n";
//        else if (bytes > 1 && bits == 1) {
//            if (bytes % 2 == 0)
//                return "0\n" + stringBinary(bytes - 1, maxBytes, maxBits, maxBits);
//            else
//                return "1\n" + stringBinary(bytes - 1, maxBytes, maxBits, maxBits);
//        }
//        else if (bytes == 1 && bits > 1)
//            return "1" + stringBinary(bytes, maxBytes, bits - 1, maxBits);
//        else {
//            if (bytes <= maxBytes / 2 && bits == maxBits)
//                return "1" + stringBinary(bytes, maxBytes, bits - 1, maxBits);
//            else {
//                if ((maxBytes / 2) % 2 == 0)
//                    return "1" + stringBinary(bytes, maxBytes, bits - 1, maxBits);
//                else
//                    return "0" + stringBinary(bytes, maxBytes, bits - 1, maxBits);
//            }
//        }
//    }

//    public static void countBinary(int n) {
//        countBinary(n, "");
//    }
//
//    private static void countBinary(int n, String string) {
//        if (n == 0)
//            System.out.println(string);
//        else {
//            countBinary(n - 1, string + "0");
//            countBinary(n - 1, string + "1");
//        }
//    }

    public static void countBinary(int n) {
        System.out.print(countBinary(n, ""));
    }

    private static String countBinary(int n, String string) {
        if (n == 0)
            return string;
        else {
            return countBinary(n - 1, string + "0")
                    + "\n" + countBinary(n - 1, string + "1");
        }
    }

//    public static void countBinary(int n, int j) {
//        countBinary(n, j, "");
//    }
//
//    private static void countBinary(int n, int j, String string) {
//        if (n == 0)
//            System.out.println(string);
//        else {
//            for (int i = 0; i < j; i++) {
//                countBinary(n - 1, j, string + i);
//            }
//        }
//    }
}
