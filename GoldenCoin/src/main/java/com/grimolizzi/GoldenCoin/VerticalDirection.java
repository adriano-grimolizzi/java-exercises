package com.grimolizzi.GoldenCoin;

enum VerticalDirection {
	UP("^"), 
	DOWN("v");	
	
	private final String symbol;
	
	VerticalDirection(String s) {
		symbol = s;
	}
	
	String getSymbol() {
		return this.symbol;
	}
}
