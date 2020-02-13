package CS_202.W4.InClass_Finance;
// Doug Gilchrist 1/29/20 [Interfaces/Abstract Classes]
public abstract class ShareAsset implements Asset {
    // properties
    private String symbol;
    private double totalCost, currentPrice;
    private int totalShares;

    // constructors
    public ShareAsset(String symbol, int totalShares, double currentPrice) {
        setSymbol(symbol);
        setTotalShares(totalShares);
        setCurrentPrice(currentPrice);
        this.totalCost = totalShares * currentPrice;
    }

    // mutators
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public void setCurrentPrice(double currentPrice) { this.currentPrice = currentPrice; }

    public void setTotalShares(int totalShares) { this.totalShares = totalShares; }

    // accessors
    public String getSymbol() { return symbol; }

    public double getTotalCost() { return totalCost; }

    public double getCurrentPrice() { return currentPrice; }

    public int getTotalShares() { return totalShares; }

    public abstract String getAssetType();

    public String toString() {
        return "Asset: " + getAssetType() + "\n"
                + "Symbol: " + getSymbol() + "\n"
                + "Total Shares: " + getTotalShares() + "\n"
                + "Total Cost: " + getTotalCost() + "\n"
                + "Current Price: " + getCurrentPrice() + "\n"
                + "Profit/Loss: " + getProfit();
    }
    // methods

    public double getProfit() {
        // call abstract getMarketValue() method - implemented by sub-classes
        return getMarketValue() - totalCost;
    }

    // returns market value of asset (whatever it is)
    public abstract double getMarketValue();
}
