package CS_202.W6.PracticeIt;

public class MysteryTest {
    public static void main(String[] args) {
//        mystery1(1);
//        mystery2(113);
//        mystery3(0);
//        mysteryXY(4, 1);
//        System.out.println(mystery4(6, 13));
//        System.out.println(mystery5(5, 7));
        System.out.println(mystery6(7, 1));
        System.out.println();
//        mystery1(4);
//        mystery2(70);
//        mystery3(1);
//        mysteryXY(4, 2);
//        System.out.println(mystery4(14, 10));
//        System.out.println(mystery5(12, 9));
        System.out.println(mystery6(4, 2));
        System.out.println();
//        mystery1(16);
//        mystery2(42);
//        mystery3(2);
//        mysteryXY(8, 2);
//        System.out.println(mystery4(37, 10));
//        System.out.println(mystery5(-7, 4));
        System.out.println(mystery6(4, 3));
        System.out.println();
//        mystery1(30);
//        mystery2(30);
//        mystery3(4);
//        mysteryXY(4, 3);
//        System.out.println(mystery4(8, 2));
//        System.out.println(mystery5(-23, -48));
        System.out.println(mystery6(5, 3));
        System.out.println();
//        mystery1(100);
//        mystery2(10);
//        mystery3(5);
//        mysteryXY(3, 4);
//        System.out.println(mystery4(50, 7));
//        System.out.println(mystery5(128, 343));
        System.out.println(mystery6(5, 4));
        System.out.println();
    }

    public static void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n / 2);
            System.out.print(", " + n);
        }
    }

    public static void mystery2(int n) {
        if (n > 100) {
            System.out.print(n);
        } else {
            mystery2(2 * n);
            System.out.print(", " + n);
        }
    }

    public static void mystery3(int n) {
        if (n <= 0) {
            System.out.print("*");
        } else if (n % 2 == 0) {
            System.out.print("(");
            mystery3(n - 1);
            System.out.print(")");
        } else {
            System.out.print("[");
            mystery3(n - 1);
            System.out.print("]");
        }
    }

    public static void mysteryXY(int x, int y) {
        if (y == 1) {
            System.out.print(x);
        } else {
            System.out.print(x * y + ", ");
            mysteryXY(x, y - 1);
            System.out.print(", " + x * y);
        }
    }

    public static int mystery4(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return mystery4(x - y, y);
        }
    }

    public static int mystery5(int x, int y) {
        if (x < 0) {
            return -mystery5(-x, y);
        } else if (y < 0) {
            return -mystery5(x, -y);
        } else if (x == 0 && y == 0) {
            return 0;
        } else {
            return 100 * mystery5(x / 10, y / 10) + 10 * (x % 10) + y % 10;
        }
    }

    public static int mystery6(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k > n) {
            return 0;
        } else {
            return mystery6(n - 1, k - 1) + mystery6(n - 1, k);
        }
    }
}
