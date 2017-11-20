package com.sharemarket.controller;

import com.sharemarket.models.StockPrice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class StockPriceController {

    @RequestMapping(path="/stocks", method = RequestMethod.GET)
    public List list(){
        return StockPriceStub.list();
    }

    @RequestMapping(path = "/stock/{stockId}", method = RequestMethod.GET)
    public StockPrice get(@PathVariable Long stockId){
        return StockPriceStub.get(stockId);
    }

    @RequestMapping(path = "/stocks", method = RequestMethod.POST)
    public StockPrice post(@RequestBody StockPrice stock){
        return StockPriceStub.create(stock);
    }

    @RequestMapping(path = "/stock/{id}", method = RequestMethod.PUT)
    public StockPrice put(@PathVariable Long id, @RequestBody StockPrice stock){
        return StockPriceStub.update(id, stock);
    }

    @RequestMapping(path = "/stock/{id}", method = RequestMethod.DELETE)
    public StockPrice delete(@PathVariable Long id){
        return StockPriceStub.delete(id);
    }

}
