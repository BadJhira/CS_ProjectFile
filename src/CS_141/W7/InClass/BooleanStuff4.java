package CS_141.W7.InClass;
// 11/7/19 Doug Gilchrist [Boolean Zen]
public class BooleanStuff4 {
    public static void main(String[] args) {

        System.out.println(boolIfElse(3, 5));
        System.out.println(boolZen(3, 5));

    }

    public static boolean boolIfElse(int n1, int n2) {
        // way too much code
        if (n1 % 2 == 0 && n2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean boolZen(int n1, int n2) {
        // much better code
        return (n1 % 2 == 0 && n2 % 2 == 0);
    }
}
