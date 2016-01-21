package com.gigigo.myapplication.chapter04;

import com.gigigo.myapplication.chapter04.dto.Stock;

import org.junit.Before;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PortfolioTest {

    private HashMap<String, List<Stock>> mapStock;
    private Stock stock1;
    private Stock stock2;
    private Stock stock3;

    private List<Stock> list(Stock... stocks)  {
        List<Stock> stockList = new ArrayList<>();
        for (Stock stock : stocks) {
            stockList.add(stock);
        }
        return stockList;
    }

    @Before
    public void setUp() throws Exception {
        mapStock = new HashMap<>();

        stock1 = new Stock("1234", BigDecimal.TEN);
        stock2 = new Stock("3456", BigDecimal.TEN);
        stock3 = new Stock("1234", BigDecimal.ONE);
    }

//    @Test
    public void testAddOneStock() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);

        assertEquals(1, mapStock.size());
        assertThat(list(stock1), is(mapStock.get("1234")));
    }

//    @Test
    public void testAddTwoSameStocks() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);
        portfolio.buy(stock1);

        assertEquals(1, mapStock.size());
        assertThat(list(stock1, stock1), is(mapStock.get("1234")));
    }

//    @Test
    public void testAddTwoDistinctStocks() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);
        portfolio.buy(stock2);

        assertEquals(2, mapStock.size());
        assertThat(list(stock1), is(mapStock.get("1234")));
        assertThat(list(stock2), is(mapStock.get("3456")));
    }

//    @Test
    public void testAddMoreStocks() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);
        portfolio.buy(stock1);
        portfolio.buy(stock1);
        portfolio.buy(stock2);
        portfolio.buy(stock2);

        assertEquals(2, mapStock.size());
        assertThat(list(stock1, stock1, stock1), is(mapStock.get("1234")));
        assertThat(list(stock2, stock2), is(mapStock.get("3456")));
    }

//    @Test
    public void testSellNullStock() throws Exception {
        Portfolio portfolio = new Portfolio();
        portfolio.sell(null, 1);
    }

//    @Test
    public void testSellOne() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);

        portfolio.sell(stock1, 1);

        assertEquals(1, mapStock.size());
        assertThat(list(), is(mapStock.get("1234")));
    }

//    @Test
    public void testSellOne1() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);
        portfolio.buy(stock1);
        portfolio.buy(stock1);

        portfolio.sell(stock1, 1);

        assertEquals(1, mapStock.size());
        assertThat(list(stock1, stock1), is(mapStock.get("1234")));
    }

//    @Test
    public void testSellMoreQuantity() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);

        portfolio.sell(stock1, 4);

        assertEquals(1, mapStock.size());
        assertThat(list(), is(mapStock.get("1234")));
    }

//    @Test(expected = IllegalStateException.class)
    public void testSellNullMap() throws Exception {
        mapStock.put("1234", null);

        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.sell(stock1, 1);
    }

//    @Test
    public void testAvgPriceNullStock() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        assertEquals(BigDecimal.ZERO, portfolio.getAvgPrice(null));
    }

//    @Test
    public void testAvgPriceNullStock1() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        assertEquals(BigDecimal.ZERO, portfolio.getAvgPrice(stock1));
    }

//    @Test
    public void testAvgPriceOne() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);

        assertEquals(BigDecimal.TEN, portfolio.getAvgPrice(stock1));
    }

//    @Test
    public void testAvgPriceTwo() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);
        portfolio.buy(stock1);

        assertEquals(BigDecimal.TEN, portfolio.getAvgPrice(stock3));
    }

//    @Test
    public void testAvgPriceTwo2() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);
        portfolio.buy(stock3);

        assertEquals(BigDecimal.valueOf(5.5), portfolio.getAvgPrice(stock1));
    }

//    @Test
    public void testCurrentValueZero() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        assertEquals(BigDecimal.ZERO, portfolio.getCurrentValue());
    }

//    @Test
    public void testCurrentValueZero1() throws Exception {
        mapStock.put("1234", null);

        Portfolio portfolio = new Portfolio(mapStock);
        assertEquals(BigDecimal.ZERO, portfolio.getCurrentValue());
    }

//    @Test
    public void testCurrentValueOneStock() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);

        assertEquals(BigDecimal.TEN, portfolio.getCurrentValue());
    }

//    @Test
    public void testCurrentValueSameStocks() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);
        portfolio.buy(stock1);
        portfolio.buy(stock1);

        assertEquals(BigDecimal.valueOf(30), portfolio.getCurrentValue());
    }

//    @Test
    public void testCurrentValueDistinctStocks() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);
        portfolio.buy(stock3);

        assertEquals(BigDecimal.valueOf(11), portfolio.getCurrentValue());
    }

//    @Test
    public void testCurrentValueMoreStocks() throws Exception {
        Portfolio portfolio = new Portfolio(mapStock);
        portfolio.buy(stock1);
        portfolio.buy(stock1);
        portfolio.buy(stock3);
        portfolio.buy(stock3);
        portfolio.buy(stock3);

        assertEquals(BigDecimal.valueOf(23), portfolio.getCurrentValue());
    }
}
