package com.gigigo.myapplication.chapter04;


import com.gigigo.myapplication.chapter04.dto.Stock;

public interface MarketWatcher {
   Stock getQuote(String symbol);
}
