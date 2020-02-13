package CS_141.W11.Final;
// Doug Gilchrist - Final - Question 12
public class StockMain {
    public static void main(String[] args) {
        Stock  myStock = new  Stock();
        myStock.purchase(20, 3.50);
        myStock.purchase(10, 2.00);
        double profit = myStock.getProfit(4.00);
        System.out.println(profit);    // 30.0
    }
}
