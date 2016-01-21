package com.gigigo.myapplication.chapter04.dto;

import java.math.BigDecimal;

public class Stock {
	private final String symbol;
	private BigDecimal price;

	public Stock(String id, BigDecimal price) {
		this.symbol = id;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public BigDecimal getPrice() {
		return price;
	}
}
