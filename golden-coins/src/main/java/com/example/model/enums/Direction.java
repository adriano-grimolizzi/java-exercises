package com.example.model.enums;

public enum Direction {
    UP('^'),
    DOWN('v'),
    LEFT('<'),
    RIGHT('>');

    private final char symbol;

    Direction(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }
}
