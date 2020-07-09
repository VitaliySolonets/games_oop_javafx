package ru.job4j.chess;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void whenWayIsFreeThanTrue() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        boolean rsl = logic.move(Cell.C1, Cell.H6);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenWayIsNotFreeThanFalse() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.A1);
        Figure bishopInTheWay = new BishopBlack(Cell.E3);
        logic.add(bishop);
        logic.add(bishopInTheWay);
        boolean result = logic.move(Cell.C1, Cell.G5);
        assertThat(result, is(false));

    }
}