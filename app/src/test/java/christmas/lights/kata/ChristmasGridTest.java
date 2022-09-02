package christmas.lights.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;



class ChristmasGridTest {

    @Test
    void check_the_length_of_grid(){
        ChristmasGrid grid= new ChristmasGrid();
        int expectedLength = 1000;

        grid.createGrid();
        int gridLength = grid.createGrid().length;

        assertThat(gridLength).isEqualTo(expectedLength);


    }

    @Test
    void turn_on_all_lights_on_the_christmas_grid(){
        Coordinate startCoordinate = new Coordinate(0,0);
        Coordinate endCoordinate = new Coordinate(999,999);
        ChristmasGrid grid= new ChristmasGrid();
        int expectedLightsOn = 1000000;

        grid.createGrid();
        grid.turnOnLights(startCoordinate, endCoordinate);
        int lightsOnResult = grid.lightsCounter();
        assertThat(lightsOnResult).isEqualTo(expectedLightsOn);
    }

    @Test
    void given_the_coordinates_00_and_22_it_will_turn_on_9_lights(){
        Coordinate startCoordinate = new Coordinate(0,0);
        Coordinate endCoordinate = new Coordinate(2,2);
        ChristmasGrid grid= new ChristmasGrid();
        int expectedLightsOn = 9;

        grid.createGrid();
        grid.turnOnLights(startCoordinate, endCoordinate);
        int lightsOnResult = grid.lightsCounter();
        assertThat(lightsOnResult).isEqualTo(expectedLightsOn);


    }



}