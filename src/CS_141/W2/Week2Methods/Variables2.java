package CS_141.W2.Week2Methods;
// Doug Gilchrist
public class Variables2 {
    public static void main(String[] args) {
        double subTotal = 38 + 40 + 30;
        double tax = subTotal * .08;
        double tip = subTotal * .15;
        double total = subTotal + tax + tip;

        System.out.println("======First Receipt======");
        System.out.print("Subtotal:\t");
        System.out.println(38 + 40 + 30);
        System.out.print("Tax:\t\t");
        System.out.println((38 + 40 + 30) * 0.08);
        System.out.print("Tip:\t\t");
        System.out.println((38 + 40 + 30) * 0.15);
        System.out.print("Total:\t\t");
        System.out.println(38 + 40 + 30 + (38 + 40 + 30) * 0.15 + (38 + 40 + 30) * 0.08 + "\n");

        System.out.println("======Second Receipt=====");
        System.out.println("Subtotal:\t" + subTotal);
        System.out.println("Tax:\t\t" + tax);
        System.out.println("Tip:\t\t" + tip);
        System.out.println("Total:\t\t" + total);
    }
}
