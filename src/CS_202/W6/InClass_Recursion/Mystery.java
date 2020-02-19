package CS_202.W6.InClass_Recursion;

public class Mystery {
    public static void main(String[] args) {
        mystery(10);
        System.out.println();
        mystery(101);
        System.out.println();
        mystery(849);
        System.out.println();
        mystery(-1001);
        System.out.println();
        mystery(800203);
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
