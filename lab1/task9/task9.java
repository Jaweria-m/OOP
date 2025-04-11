import java.util.Scanner;
public class task9{

public static void main(String args[]){
Scanner src=new Scanner(System.in);
System.out.println("**Calculator**\n");
System.out.print("Enter the First Number: ");
int num1=src.nextInt();
System.out.print("Enter the operation('+','-','/','*'): ");
char sign=src.next().charAt(0);
System.out.print("Enter the Second Number: ");
int num2=src.nextInt();

if(sign=='+'){
System.out.println("The Addition is: "+(num1+num2));
}
else if(sign=='-'){
System.out.println("The substraction is: "+(num1-num2));
}
else if(sign=='/'){
System.out.println("The Division is: "+(num1/num2));
}
else if(sign=='*'){
System.out.println("The Multiplication is: "+(num1*num2));
}
else{
System.out.println("Type Arithmatic operations which are mentioned!");
}






}
}