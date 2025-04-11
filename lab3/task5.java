import java.util.Scanner;
public class task5{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int rows = 5, cols=5;
boolean[][] seats=new boolean[rows][cols]; // false = available, true = reserved
int choice;
do{
System.out.println("\n1. Display available seats");
System.out.println("2. Reserve a seat");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
choice=scanner.nextInt();
switch(choice) {

case 1:
System.out.println("Available seats(false = available, true=reserved):");
for(int i=0; i<rows; i++){
for(int j=0; j<cols; j++){
System.out.print(seats[i][j] + " ");
}
System.out.println();
}
break;

case 2:
System.out.print("Enter row number (1-"+ rows+ "): ");
int row = scanner.nextInt() - 1;
System.out.print("Enter column number(1-"+cols+ "): ");
int col = scanner.nextInt() - 1;
if(row >=0 && row <rows && col>=0 && col < cols) {
if(!seats[row][col]){
seats[row][col]=true;
System.out.println("Seat reserved successfully!");
}else{
System.out.println("Seat is already reserved.");
}
}else{
System.out.println("Invalid range.");
}
break;

case 3:
System.out.println("Exiting...");
break;

default:
System.out.println("Invalid choice. Please try again.");
}
}while(choice!=3);

}
}

