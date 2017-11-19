package com.sharemarket.models;

public class StockPrice{

    private Long id;
    private String stockCode;
    private String stockName;
    private Float price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public String getStockCode() {
        return stockCode;
    }

    public Float getPrice() {
        return price;
    }

    StockPrice(Long id, String stockCode, String stockName, Float price) {
        this.id = id;
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.price = price;
    }
}
