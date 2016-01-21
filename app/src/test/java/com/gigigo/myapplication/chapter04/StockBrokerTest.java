package com.gigigo.myapplication.chapter04;

import com.gigigo.myapplication.chapter04.dto.Stock;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class StockBrokerTest {

//    @Test
    public void testCurrentStatus() throws Exception {
        Stock stock = new Stock("1234", BigDecimal.TEN);

        MarketWatcher mockMarketWatcher = mock(MarketWatcher.class);

        when(mockMarketWatcher.getQuote(anyString())).thenReturn(stock);

        assertThat(stock, is(mockMarketWatcher.getQuote("1234")));
    }

//    @Test
    public void testPerformNothingStocks() throws Exception {
        Stock stock = new Stock("1234", new BigDecimal("11.00"));

        MarketWatcher mockMarketWatcher = mock(MarketWatcher.class);
        Portfolio mockPortfolio = mock(Portfolio.class);

        when(mockMarketWatcher.getQuote(anyString())).thenReturn(stock);

        when(mockPortfolio.getAvgPrice(isA(Stock.class))).thenReturn(new BigDecimal("10.00"));

        StockBroker stockBroker = new StockBroker(mockMarketWatcher);
        stockBroker.perform(mockPortfolio, stock);

        verify(mockPortfolio, never()).buy(isA(Stock.class));
        verify(mockPortfolio, never()).sell(stock, 10);
    }

//    @Test
    public void testPerformSellStocks() throws Exception {
        Stock stock = new Stock("1234", new BigDecimal("11.20"));

        MarketWatcher mockMarketWatcher = mock(MarketWatcher.class);
        Portfolio mockPortfolio = mock(Portfolio.class);

        when(mockMarketWatcher.getQuote(anyString())).thenReturn(stock);

        when(mockPortfolio.getAvgPrice(isA(Stock.class))).thenReturn(new BigDecimal("10.00"));

        StockBroker stockBroker = new StockBroker(mockMarketWatcher);
        stockBroker.perform(mockPortfolio, stock);

        verify(mockPortfolio, never()).buy(isA(Stock.class));
        verify(mockPortfolio).sell(stock, 10);
    }

//    @Test
    public void testPerformBuyStocks() throws Exception {
        Stock stock = new Stock("1234", new BigDecimal("10.50"));

        MarketWatcher mockMarketWatcher = mock(MarketWatcher.class);
        Portfolio mockPortfolio = mock(Portfolio.class);

        when(mockMarketWatcher.getQuote(anyString())).thenReturn(stock);

        when(mockPortfolio.getAvgPrice(isA(Stock.class))).thenReturn(new BigDecimal("10.00"));

        StockBroker stockBroker = new StockBroker(mockMarketWatcher);
        stockBroker.perform(mockPortfolio, stock);

//        verify(mockPortfolio).buy(isA(Stock.class));
        verify(mockPortfolio, never()).sell(stock, 10);
    }
}
