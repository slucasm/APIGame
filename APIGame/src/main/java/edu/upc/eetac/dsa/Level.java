package edu.upc.eetac.dsa;

public class Level {

    int idLevel;
    int numRows,numColumns;
    int [][] matrix;

    public Level(){

    }
    public Level(int idLevel,int numRows,int numColumns,int[][] matrix){
        this.idLevel = idLevel;
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.matrix = matrix;
    }

    public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
