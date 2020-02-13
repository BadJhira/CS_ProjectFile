package CS_202.W4.InClass_Finance;
// Doug Gilchrist 1/29/20 [Interfaces/Abstract Classes]
public class Stock extends ShareAsset {
    // properties

    // constructors
    public Stock(String symbol, int totalShares, double currentPrice) {
        super(symbol, totalShares, currentPrice);
    }

    // mutators

    // accessors
    public String getAssetType() { return "Stock"; }

    // methods
    public double getMarketValue() {
        return getTotalShares() * getCurrentPrice();
    }
}
