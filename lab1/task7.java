import java.util.Scanner;
public class task7{
    
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the radius of the cylinder: ");
double radius = scanner.nextDouble();
System.out.print("Enter the height of the cylinder: ");
double height= scanner.nextDouble();
double pi=3.14159;
double volume=pi*radius*radius*height;
System.out.println("The volume of the cylinder is: "+volume);

}
}
