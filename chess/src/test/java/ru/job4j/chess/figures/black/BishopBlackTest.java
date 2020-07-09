package ru.job4j.chess.figures.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BishopBlackTest {
    @Test
    public void whenPositionOk() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(Cell.A1));
    }

    @Test
    public void whenCopyOk() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure result = bishopBlack.copy(Cell.A2);
        assertThat(result.position(), is(Cell.A2));
    }

    @Test
    public void whenWayIsOk() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.C1, Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result, is(expected));
    }

    @Test
    public void whenNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean result = bishopBlack.isDiagonal(Cell.C1, Cell.C2);
        assertThat(result, is(false));
    }

}
