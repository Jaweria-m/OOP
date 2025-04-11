import java.util.Scanner;
public class task4{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
String[] name={"Jaweria","Mariam","Ali"};
String check;
System.out.print("Enter the Name: ");
check=src.nextLine();
for(int I=0; I<name.length; I++){
if(name[I].equalsIgnoreCase(check)){
System.out.print("Name Ali/ali Found!");
break;
}
else{
System.out.println("Name Ali/ali not Found!");
}
}
}
}