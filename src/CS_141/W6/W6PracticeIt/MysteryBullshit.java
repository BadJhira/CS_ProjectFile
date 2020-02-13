package CS_141.W6.W6PracticeIt;

public class MysteryBullshit {
    public static void main(String[] args) {
        System.out.println(mystery3(3, 3));
        System.out.println(mystery3(5, 3));
        System.out.println(mystery3(2, 6));
        System.out.println(mystery3(12, 18));
        System.out.println(mystery3(30, 75));
    }

    public static void mystery(int x) {
        int y = 1;
        int z = 0;
        while (2 * y <= x) {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }

    public static void mystery2(int x) {
        int y = 0;
        while (x % 2 == 0) {
            y++;
            x = x / 2;
        }
        System.out.println(x + " " + y);
    }

    public static int mystery3(int x, int y) {
        while (x != 0 && y !=0) {
            if (x < y) {
                y = y - x;
            } else {
                x = x - y;
            }
        }
        return x + y;
    }
}
