package CS_202.W3.InClass_Stock;
// Doug Gilchrist 1/22/20 [Stock Main]
public class StockMain {
    public static void main(String[] args) {
        Stock stock1 = new Stock("XYZ");

        System.out.println("---Purchase #1: 200 shares, price 0.25---");
        stock1.purchase(200, 0.25);
        stock1.printInfo();

        System.out.println();
        System.out.println("---Price changes to 0.13---");
        stock1.printProfit(0.13);

        System.out.println();
        System.out.println("---Purchase #2: 150 shares, price 0.13");
        stock1.purchase(150, 0.13);
        stock1.printInfo();

        System.out.println();
        System.out.println("---Price changes to 0.45---");
        stock1.printProfit(0.45);

        System.out.println();
        System.out.println("---Purchase #3: 200 shares, price 0.45---");
        stock1.purchase(200, 0.45);
        System.out.println("---Price changes to 0.73---");
        stock1.printProfit(0.73);
    }
}
