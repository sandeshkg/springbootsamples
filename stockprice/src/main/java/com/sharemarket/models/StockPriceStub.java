package com.sharemarket.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockPriceStub {

    private static Map<Long, StockPrice> stockPrices = new HashMap<Long, StockPrice>();
    private static Long idx = 8L;

    static{
        StockPrice acc = new StockPrice(1L, "ACC", "Associated Cement Companies Ltd", 1763.05F);
        stockPrices.put(1L,acc);

        StockPrice ashok = new StockPrice(2L, "ASHOKLEY", "Ashok Leyland", 116.00F);
        stockPrices.put(2L, ashok);

        StockPrice bharti = new StockPrice(3L, "BHARTIARTL", "Bharti Airtel", 493.50F);
        stockPrices.put(3L,bharti);

        StockPrice dabur = new StockPrice(4L, "DABUR", "Dabur India", 336.50F);
        stockPrices.put(4L,dabur);

        StockPrice reddy = new StockPrice(5L, "DRREDDY", "Dr Reddys Laboratories", 2322.60F);
        stockPrices.put(5L,reddy);

        StockPrice dlf = new StockPrice(6L, "DLF", "DLF", 223.85F);
        stockPrices.put(6L,dlf);

        StockPrice hdfc = new StockPrice(7L, "HDFC", "Housing Development Finance Corporation", 1705.50F);
        stockPrices.put(7L,hdfc);

        StockPrice infy = new StockPrice(8L, "INFY", "Infosys", 970.95F);
        stockPrices.put(8L,infy);
    }


    public static List<StockPrice> list() {
        return new ArrayList<StockPrice>(stockPrices.values());
    }

    public static StockPrice create(StockPrice stock) {
        idx += idx;
        stock.setId(idx);
        stockPrices.put(idx, stock);
        return stock;
    }

    public static StockPrice get(Long id) {
        return stockPrices.get(id);
    }

    public static StockPrice update(Long id, StockPrice stock) {
        stockPrices.put(id, stock);
        return stock;
    }

    public static StockPrice delete(Long id) {
        return stockPrices.remove(id);
    }
    
    
}
