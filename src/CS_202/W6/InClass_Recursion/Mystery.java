package CS_202.W6.InClass_Recursion;

public class Mystery {
    public static void main(String[] args) {
        mystery(7);
        System.out.println();
        mystery(38);
        System.out.println();
        mystery(749);
        System.out.println();
        mystery(-6842);
        System.out.println();
        mystery(954023);
        System.out.println();
    }

    public static void mystery(int n) {
        if (n < 0)
            mystery(-n);
        else if (n < 10)
            System.out.print(n);
        else {
            mystery(n / 10);
            int digit = n % 10;
            System.out.print(", " + (digit % 3));
        }
    }
}
