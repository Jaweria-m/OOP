import java.util.Scanner;
public class task2{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
int sum=0;
int arr[] =new int[10];
for(int I=0; I<arr.length; I++){
System.out.print("Enter the Number at "+I+" Index: ");
arr[I]=src.nextInt();
if(arr[I]%4==0){
sum+=arr[I];
}
}
System.out.println("\nThe Sum of multiple of 4 is: "+sum);
}
}
