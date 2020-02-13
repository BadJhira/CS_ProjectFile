package CS_141.W3.InClass;
// Doug Gilchrist
public class Scope {
    public static void main(String[] args) {
        int userNum = 2;
        int newNum = userNum + 1;

        for (int i = 0; i < newNum; i++) {
            int valSquared;
            valSquared = userNum * userNum;
            System.out.println("" + i + " squared: " + valSquared);
        }

        // System.out.println("Last value: " + valSquared);
    }
}
