package com.sharemarket.controller;

import com.sharemarket.models.StockPrice;
import com.sharemarket.models.StockPriceStub;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockPriceController {

    @RequestMapping(path="/stocks", method = RequestMethod.GET)
    public List GetAllStocks(){
        return StockPriceStub.list();
    }

    @RequestMapping(path = "/stock", method = RequestMethod.GET)
    public StockPrice GetStockPrice(@PathVariable("/id") Long stockCode){
        return StockPriceStub.get(stockCode);
    }

}
