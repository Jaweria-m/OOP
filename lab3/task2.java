import java.util.Scanner;
public class task2{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
String pall="level";
String rev="";
for(int i=pall.length()-1; i>=0; i--){
rev=rev+pall.charAt(i);
} 
if(pall.equals(rev)){
System.out.println("\nText is Pallindrom");
}
else{
System.out.println("Text is not Pallindrom");
}
}
}