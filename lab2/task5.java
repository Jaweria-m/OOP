public class task5{
public static void main(String[] args){
int[][] matrix={
               {1,1,0,0,1},
               {1,0,1,0,1},
               {1,0,0,1,1},
               {1,0,0,0,1}};
for(int[] row : matrix){
for(int num : row){
System.out.print(num+" ");
}
System.out.println();
}
int rows=matrix.length;
int cols=matrix[0].length;
Boolean contains=false;
for (int I=0; I<rows-2; I++){
for (int j=0; j<cols-2; j++){
if(matrix[I][j]==1 && matrix[I + 1][j + 1] == 1 && matrix[I+2][j+2]==1 &&
matrix[I+1][j]==0 && matrix[I][j+1]==1 && matrix[I+2][j+1]==0){
contains=true;
break;
}
}
}
if(contains){
System.out.println("The matrix contains the letter 'N'.");
}else{
System.out.println("The matrix does not contain the letter 'N'.");
}
}
}
