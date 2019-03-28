package com.grimolizzi.GoldenCoin;

public enum HorizontalDirection {
	LEFT("<"), 
	RIGHT(">");
	
	private final String symbol;
	
	HorizontalDirection(String s) {
		symbol = s;
	}
	
	String getSymbol() {
		return this.symbol;
	}
}