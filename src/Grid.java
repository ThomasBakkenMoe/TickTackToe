public class Grid {

    int x = 3;
    int y = 3;
    GridSquare[][] grid;
    String utskrift;

    public void grid(){
        grid = new GridSquare[y][x];
        System.out.println("Generating grid");
        genererGrid();
    }

    public void grid(int x, int y){

        this.x = x;
        this.y = y;

        genererGrid();
    }

    private void genererGrid(){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                grid[i][j] = new GridSquare();
            }
        }
    }

    public String toString(){
        String utskrift = "";

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                utskrift += grid[i][j].getValue() + "\t";
            }

            utskrift += "\n\n";
        }
        return utskrift;
    }
}