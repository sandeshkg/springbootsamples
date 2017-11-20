package com.sharemarket.models;

public class StockPrice {

    public StockPrice() {
    }

    public StockPrice(Long id, String stockCode, String stockName, Float price) {

        this.id = id;
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.price = price;
    }

    public Long getId() {

        return id;
    }

    public String getStockCode() {
        return stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public Float getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    Long id;
    String stockCode;
    String stockName;
    Float price;

}
