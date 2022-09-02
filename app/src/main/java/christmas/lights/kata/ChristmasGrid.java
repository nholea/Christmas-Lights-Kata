package christmas.lights.kata;


import java.util.Arrays;
import java.util.stream.IntStream;

public class ChristmasGrid {

    private int [][] christmasGrid;

    public ChristmasGrid(){
        this.christmasGrid = new int[6][6];

    }

    public int[][] createGrid(){
        for (int row=0; row< christmasGrid[0].length; row++){
            for (int col=0; col< christmasGrid[1].length; col++){
                christmasGrid[row][col] = new ChristmasLights().getStatus();
            }
        }
        return christmasGrid;
    }

    public void turnOnLights(Coordinate start, Coordinate end){
        int[][] turnOnLightsGrid = new int[6][6];
        for (int i= start.getX(); i<= end.getX(); i++){
            for (int j = start.getY(); j<= end.getY(); j++){
                if (christmasGrid[i][j] == 0){
                    turnOnLightsGrid[i][j] = 1;
                }
                else {
                    turnOnLightsGrid[i][j] = 1;
                }
            }
        }
        christmasGrid = turnOnLightsGrid;

    }

    public void turnOffLights(Coordinate start, Coordinate end){
        int[][] turnOffLightsGrid = new int[6][6];
        for (int i= start.getX(); i<= end.getX(); i++){
            for (int j = start.getY(); j<= end.getY(); j++){
                if (christmasGrid[i][j] == 1){
                    turnOffLightsGrid[i][j] = 0;
                }
                else {
                    turnOffLightsGrid[i][j] = 0;
                }
            }
        }
        christmasGrid = turnOffLightsGrid;
    }


    public int lightsCounter() {
        long totalLightOn= Arrays.stream(christmasGrid).flatMapToInt(Arrays::stream).filter(x -> x == 1).count();
        return Math.toIntExact(totalLightOn);
    }



    public static void main(String[] args){
        ChristmasGrid grid = new ChristmasGrid();
        System.out.println(grid.createGrid().length);
        grid.turnOnLights(new Coordinate(0,0),new Coordinate(5,5));
        System.out.println(grid.lightsCounter());
        //grid.printBoard();
        System.out.println();
        grid.turnOffLights(new Coordinate(0,0),new Coordinate(5,5));
        //grid.printBoard();
    }
}
