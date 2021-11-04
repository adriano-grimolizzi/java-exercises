package com.example;

import com.example.model.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolverTest {

    @Test
    public void shouldReturnPath() {

        Grid grid = new Grid();
        grid.getLines().add("..o.");
        grid.getLines().add("..o.");
        grid.getLines().add("o..o");

        String expectedOutput = ">>x>v<x<<vx>>x";

        Solver solver = new Solver();

        assertEquals(expectedOutput, solver.solve(grid));

    }
}
