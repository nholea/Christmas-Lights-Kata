package christmas.lights.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import org.assertj.core.api.Assertions.*;


class ChristmasGridTest {
    private int[][] grid;

    @BeforeEach
    void setUp() {
        grid = new ChristmasGrid().createGrid();
    }

    @Test
    void check_the_length_of_grid(){
        assertThat(grid.length).isEqualTo(1000);
    }
}