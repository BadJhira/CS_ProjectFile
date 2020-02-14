package CS_202.W6.PracticeIt;

public class BJP5_12_3 {
    public static void main(String[] args) {
        writeSequence(7);
    }

//    public static void writeSequence(int n) {
//        if (n < 1)
//            throw new IllegalArgumentException();
//        else if (n == 1)
//            System.out.print("1");
//        else if (n == 2)
//            System.out.print("1 1");
//        else if (n % 2 != 0) {
//            System.out.print(((n / 2) + 1) + " ");
//            writeSequence(n - 2);
//            System.out.print(" " + ((n / 2) + 1));
//        } else {
//            System.out.print((n / 2) + " ");
//            writeSequence(n - 2);
//            System.out.print(" " + (n / 2));
//        }
//    }

    public static void writeSequence(int n) {
        if (n < 1)
            throw new IllegalArgumentException();
        else if (n == 1)
            System.out.print("1");
        else if (n == 2)
            System.out.print("1 1");
        else {
            /*
            (n + 1) / 2
            works for any integer:
            (7 + 1) / 2  = 4
            (8 + 1) / 2  = 4
            (9 + 1) / 2  = 5
            (10 + 1) / 2 = 5
            */
            System.out.print(((n + 1) / 2) + " ");
            writeSequence(n - 2);
            System.out.print(" " + ((n + 1) / 2));
        }
    }
}
