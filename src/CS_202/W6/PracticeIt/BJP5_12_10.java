package CS_202.W6.PracticeIt;

public class BJP5_12_10 {
    public static void main(String[] args) {
        System.out.println(digitMatch(12345, 67812345));
    }

    public static int digitMatch(int x, int y) {
        // TODO: else if and else statements feel redundant; fix perhaps?
        if (x < 0 || y < 0)
            throw new IllegalArgumentException();
        else if (x / 10 == 0 || y / 10 == 0) {
            if (x % 10 == y % 10)
                return 1;
            else
                return 0;
        } else {
            if (x % 10 == y % 10)
                return 1 + digitMatch(x / 10, y / 10);
            else
                return digitMatch(x / 10, y / 10);
        }
    }
}
