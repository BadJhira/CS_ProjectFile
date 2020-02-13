package CS_141.W3.InClass;

public class ScopeError {
    public static void main(String[] args) {
        int i = 0;
        int tmpSum = 0;

        while (i < 5) {
            tmpSum = tmpSum + 1;
            System.out.println("tmpSum: " + tmpSum);
            i++;
        }
    }
}
