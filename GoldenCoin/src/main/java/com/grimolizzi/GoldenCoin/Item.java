package com.grimolizzi.GoldenCoin;

public enum Item {
	COIN('o'),
	MULTIPLIER('*');
	
	private final char symbol;
	
	Item(char c) {
		symbol = c;
	}
	
	char getSymbol() {
		return this.symbol;
	}
}