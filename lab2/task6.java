import java.util.Scanner;
public class task6{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
System.out.print("Enter the age: ");
short age=src.nextShort();
String result=(age>18)?"You are eligible!":"Sorry! You are not eligible!";
System.out.println(result);
}
}