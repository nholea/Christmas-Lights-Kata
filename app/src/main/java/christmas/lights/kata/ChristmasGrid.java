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

}
