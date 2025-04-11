import java.util.Scanner;
public class task1{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int start=3;
int end=100;
for(int num=start; num<=end; num++){
boolean isPrime=true;
for(int i=2; i<num; i++){
if(num%i==0){
isPrime=false;
break;
}}
if(isPrime){
System.out.println(num);
}  
}
}
}
