package CS_141.W11.Final;
// Doug Gilchrist - Final - Question 12
public class Stock {
    // fields
    int numShares;
    double moneySpentOnShares;

    // constructors
    Stock() {
        numShares = 0;
        moneySpentOnShares = 0.0;
    }
    //methods

    public void purchase(int numShares, double pricePerShare) {
        this.numShares += numShares;
        this.moneySpentOnShares += numShares * pricePerShare;
    }

    public double getProfit(double currentPricePerShare) {
        double currentValue = this.numShares * currentPricePerShare;
        return currentValue - moneySpentOnShares;
    }
}
