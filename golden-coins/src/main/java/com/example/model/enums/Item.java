package com.example.model.enums;

public enum Item {
    EMPTY('.'),
    COIN('o'),
    MULTIPLIER('*');

    private final char symbol;

    Item(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }
}