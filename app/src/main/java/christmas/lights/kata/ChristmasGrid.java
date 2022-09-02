package christmas.lights.kata;


import java.util.Arrays;

public class ChristmasGrid {

    private int [][] christmasGrid;

    public ChristmasGrid(){
        this.christmasGrid = new int[1000][1000];

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
        for (int x= start.getX(); x<= end.getX(); x++){
            for (int y = start.getY(); y<= end.getY(); y++){
                christmasGrid[x][y] = 1;

            }
        }

    }

    public void turnOffLights(Coordinate start, Coordinate end){
        for (int x= start.getX(); x<= end.getX(); x++){
            for (int y = start.getY(); y<= end.getY(); y++){
                christmasGrid[x][y] = 0;
            }
        }

    }

    public void toggleLights(Coordinate start, Coordinate end){
        for (int i= start.getX(); i<= end.getX(); i++){
            for (int j = start.getY(); j<= end.getY(); j++){
                if (christmasGrid[i][j] == 0){
                    christmasGrid[i][j] = 1;
                }else {
                    christmasGrid[i][j] = 0;
                }
                }
            }
        }

    public int lightsCounter() {
        long totalLightOn= Arrays.stream(christmasGrid).flatMapToInt(Arrays::stream).filter(x-> x== 1).count();
        return Math.toIntExact(totalLightOn);

    }


    public static void main(String[] args){
        ChristmasGrid grid = new ChristmasGrid();
        grid.turnOnLights(new Coordinate(887,9),new Coordinate(959,629));
        grid.turnOnLights(new Coordinate(454,398  ),new Coordinate(844,448));
        grid.turnOffLights(new Coordinate(539,243),new Coordinate(559,965));
        grid.turnOffLights(new Coordinate(370,819),new Coordinate(676,868));
        grid.turnOffLights(new Coordinate(145,40 ),new Coordinate(370,997));
        grid.turnOffLights(new Coordinate(301,3),new Coordinate(808,453));
        grid.turnOnLights(new Coordinate(351,678 ),new Coordinate(951,908));
        grid.toggleLights(new Coordinate(720,196 ),new Coordinate(897,994));
        grid.toggleLights(new Coordinate(831,394 ),new Coordinate(904,860));

        System.out.println(grid.lightsCounter());

    }
}
