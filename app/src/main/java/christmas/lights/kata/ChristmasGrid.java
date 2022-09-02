package christmas.lights.kata;


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

    public static void main(String[] args){
        ChristmasGrid grid = new ChristmasGrid();
        System.out.println(grid.createGrid().length);
    }

}
