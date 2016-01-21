package com.gigigo.myapplication.chapter04;

import com.gigigo.myapplication.chapter04.dto.Stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Portfolio {

    private Map<String, List<Stock>> stockMap = new HashMap<>();

    public Portfolio() {
        stockMap = new HashMap<>();
    }

    public Portfolio(Map<String, List<Stock>> stockMap) {
        this.stockMap = stockMap;
    }

    public void buy(Stock stock) {
        if (stock != null) {
            List<Stock> stocks = stockMap.get(stock.getSymbol());
            if (stocks != null) {
                stocks.add(stock);
            } else {
                stocks = new ArrayList<Stock>();
                stocks.add(stock);
                stockMap.put(stock.getSymbol(), stocks);
            }
        }
    }

    public void sell(Stock stock, int quantity) {
        if (stock != null) {
            List<Stock> stocks = stockMap.get(stock.getSymbol());
            if (stocks == null) {
                throw new IllegalStateException(stock.getSymbol() + " not bought");
            }

            if (stocks.size() < quantity) {
                quantity = stocks.size();
            }

            for (int i = quantity - 1; i >= 0; i--) {
                stocks.remove(i);
            }
        }
    }

    public BigDecimal getAvgPrice(Stock stock) {
        BigDecimal avgPrice = BigDecimal.ZERO;
        if (stock != null) {
            List<Stock> stocks = stockMap.get(stock.getSymbol());
            if (stocks != null) {
                for (Stock aStock : stocks) {
                    avgPrice = avgPrice.add(aStock.getPrice());
                }

                avgPrice = avgPrice.divide(new BigDecimal(stocks.size()));
            }
        }
        return avgPrice;
    }

    public BigDecimal getCurrentValue() {
        BigDecimal avgPrice = BigDecimal.ZERO;
        for (String stockId : stockMap.keySet()) {
            List<Stock> stockList = stockMap.get(stockId);
            if (stockList != null) {
                for (Stock stock : stockList) {
                    avgPrice = avgPrice.add(stock.getPrice());
                }
            }
        }

        return avgPrice;
    }
}
