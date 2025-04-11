import java.util.Scanner;
public class task1{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
char[] const_arr={'j','a','w','e','r','i','a'};
System.out.print("Enter any character: ");
char var=src.next().charAt(0);
if(var==const_arr[0] || var==const_arr[1] || var==const_arr[2] || var==const_arr[3] || var==const_arr[4] 
|| var==const_arr[5] || var==const_arr[6] ){
System.out.println("Character "+var+" is present!");
}
else{
System.out.println("Character "+var+" is not present!");
}
}
}