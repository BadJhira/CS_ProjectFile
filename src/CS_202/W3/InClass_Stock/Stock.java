package CS_202.W3.InClass_Stock;
// Doug Gilchrist 1/22/20 [Stock Class]
public class Stock {
    // properties
    private String symbol;
    private int totalShares;
    private double totalCost;

    // constructors
    public Stock(String symbol) {
        setSymbol(symbol);
        totalShares = 0;
        totalCost = 0;
    }

    // mutators
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public void purchase(int numShares, double sharePrice) {
        if ( numShares < 1 || sharePrice <= 0 ) { throw new IllegalArgumentException(); }

        totalShares += numShares;
        totalCost += sharePrice * numShares;
    }

    // accessors
    public String getSymbol() { return symbol; }

    public int getTotalShares() { return totalShares; }

    public double getTotalCost() { return totalCost; }

    public void printInfo() {
        System.out.println("Stock: " + getSymbol());
        System.out.println("Total Shares: " + getTotalShares());
        System.out.println("Total Cost: " + getTotalCost());
    }

    public double getProfit(double currentPrice) {
        return (getTotalShares() * currentPrice) - getTotalCost();
    }

    public void printProfit(double currentPrice) {
        printInfo();
        System.out.println("Current Stock Price: " + currentPrice);
        System.out.println("Current Total Value: " + (getTotalShares() * currentPrice));
        if (getProfit(currentPrice) > 0)
            System.out.print("Current profit: ");
        else
            System.out.print("Current loss: ");
        System.out.println(getProfit(currentPrice));
    }
}
