package CS_202.W4.InClass_Finance;
// Doug Gilchrist 1/29/20 [Interfaces/Abstract Classes]
public class DividendStock extends Stock {
    // properties
    private double dividends;

    // constructors
    public DividendStock(String symbol, int totalShares, double currentPrice, double dividends) {
        super(symbol, totalShares, currentPrice);
        setDividends(dividends);
    }

    // mutators
    public void setDividends(double dividends) { this.dividends = dividends; }

    // accessors
    public double getDividends() { return dividends; }

    public String getAssetType() { return "Dividend Stock"; }

    public String toString() {
        return super.toString() + "\n"
                + "Dividends: " + getDividends();
    }

    // methods
    public void payDividends(double amountPerShare) {
        dividends += amountPerShare * getTotalShares();
    }

    public double getMarketValue() {
        return super.getMarketValue() + dividends;
    }
}
