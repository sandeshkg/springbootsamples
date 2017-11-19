package com.sharemarket.com.stock.models;

public class StockPrice{

    private String stockCode;
    private Float price;

    public String getStockCode() {
        return stockCode;
    }

    public Float getPrice() {
        return price;
    }

    StockPrice(String stockCode, Float price) {
        this.stockCode = stockCode;
        this.price = price;
    }
}
