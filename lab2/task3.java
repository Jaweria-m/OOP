import java.util.Scanner;
public class task3{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
int sum=0;
System.out.print("Enter the number of rows: ");
int row=src.nextInt();
System.out.print("Enter the number of Colums: ");
int col=src.nextInt();
int matrix1[][]=new int[row][col];
int matrix2[][]=new int[row][col];
for(int I=0; I<row; I++){
  for(int j=0; j<col; j++){
System.out.print("Enter the elements of first matrix: ");
matrix1[I][j]=src.nextInt();
}
}
for(int I=0; I<row; I++){
  for(int j=0; j<col; j++){
System.out.print("Enter the elements of Second matrix: ");
matrix2[I][j]=src.nextInt();
}
}

System.out.println("\nSum of Matrices");
for(int I=0; I<row; I++){
 for(int j=0; j<col; j++){
sum=matrix1[I][j]+matrix2[I][j];
System.out.print(sum+"\t");
}
System.out.println();
}
}
}