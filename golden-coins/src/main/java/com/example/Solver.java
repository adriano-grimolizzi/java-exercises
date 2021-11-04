package com.example;

import com.example.model.Grid;
import com.example.model.enums.Direction;

import static com.example.utils.StringUtils.removeLastCharacter;
import static com.example.utils.StringUtils.reverseString;

public class Solver {

    private String solutionPath = "";
    private Direction currentDirection = Direction.RIGHT;

    public String solve(Grid grid) {
        grid.getLines().forEach(line -> {
            if (currentDirection.equals(Direction.RIGHT)) {
                solve(line);
            } else {
                solve(reverseString(line));
            }
            this.solutionPath += 'v';
            invertDirection();
        });
        return removeLastCharacter(this.solutionPath);
    }

    public void solve(String line) {
        char characterToAppend;
        for (char c : line.toCharArray()) {
            switch (c) {
                case '.' -> characterToAppend = currentDirection.getSymbol();
                case 'o' -> characterToAppend = 'x';
                default -> throw new IllegalStateException("Unexpected value: " + c);
            }
            this.solutionPath += characterToAppend;
        }
    }

    private void invertDirection() {
        if (this.currentDirection.equals(Direction.RIGHT)) {
            this.currentDirection = Direction.LEFT;
        } else {
            this.currentDirection = Direction.RIGHT;
        }
    }
}
