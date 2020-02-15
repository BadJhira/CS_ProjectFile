package CS_202.W6.PracticeIt;

public class BJP5_12_16 {
    public static void main(String[] args) {
//        System.out.println(-4556 % 10); // -6
//        System.out.println(9 / 10); // 0
        System.out.println(evenDigits(436872)); // 4682
    }

//    public static int evenDigits(int n) {
//        if (n / 10 == 0) {
//            if (n % 2 == 0)
//                return n;
//            else
//                return 0;
//        } else {
//            if (n % 2 == 0)
//                return (10 * evenDigits(n / 10)) + (n % 10);
//            else
//                return evenDigits(n / 10);
//        }
//    }

    public static int evenDigits(int n) {
        if (n == 0)
            return 0;
        else if (n % 2 == 0)
            return (10 * evenDigits(n / 10)) + (n % 10);
        else
            return evenDigits(n / 10);
    }
}
