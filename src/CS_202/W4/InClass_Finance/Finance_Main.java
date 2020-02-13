package CS_202.W4.InClass_Finance;
// Doug Gilchrist 1/29/20 [Interfaces/Abstract Classes]
import java.util.*;

public class Finance_Main {
    public static void main(String[] args) {
        Stock stock_1 = new Stock("XYZA", 15, 250.0);
        Stock stock_2 = new Stock("BIGB", 27, 320.0);
        DividendStock divstock_1 = new DividendStock("DIVS", 125, 425.0, 2.50);

        ArrayList<Asset> assetlist = new ArrayList<>();

        assetlist.add(stock_1);
        assetlist.add(stock_2);
        assetlist.add(divstock_1);

        stock_1.setCurrentPrice(350.0);
        stock_2.setCurrentPrice(300.0);
        divstock_1.setCurrentPrice(426.0);

        System.out.println("=====For loop=====");
        for (int i = 0; i < assetlist.size(); i++) {
            System.out.println(assetlist.get(i) + "\n");
        }

        System.out.println("=====ForEach loop=====");
        for (Asset asset: assetlist) {
            System.out.println(asset + "\n");
        }
    }
}
