class Matrix{
    int rows;
    int columns;
    int[][] matx;

public Matrix(int rows, int columns){
    this.rows=rows;
    this.columns=columns;
    this.matx=new int[rows][columns];
}
public void getMatrix(){
System.out.println("Matrix("+rows+"x"+columns+"):");
     for (int i=0; i<rows; i++){
     for(int j=0; j<columns; j++){
System.out.print(matx[i][j]+" ");
}
System.out.println();
}
}
public void setElement(int row, int column, int value){
        if(row>=0 && row<rows && column>=0 && column<columns) {
        matx[row][column]=value;
} else{
System.out.println("Invalid row or column index.");
}
}
public static void main(String[] args){
        Matrix matrix1 = new Matrix(4, 3);
        Matrix matrix2 = new Matrix(3, 3);
        int[][] initialMatrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
};
matrix1.matx = initialMatrix1;
       int[][] initialMatrix2 = {
            {13, 14, 15},
            {16, 17, 18},
            {19, 20, 21}};
        matrix2.matx = initialMatrix2;
        matrix1.setElement(1, 2, 3);
System.out.println("Matrix 1:");
        matrix1.getMatrix();
System.out.println("Matrix 2:");
        matrix2.getMatrix();
}
}