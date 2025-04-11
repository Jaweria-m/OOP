import java.util.Scanner;
public class circle{
String color;
double radius;

void calculateArea(){

double area=(int)(3.14*radius*radius);
System.out.println("The Calulated Area: "+area);
}

public static void main(String args[]){
circle green_circle=new circle();
circle red_circle=new circle();

green_circle.color="Green";
green_circle.radius=3.3;

red_circle.color="Red";
red_circle.radius=4.4;


System.out.println(red_circle.radius);
System.out.println(green_circle.radius);

green_circle.calculateArea();
red_circle.calculateArea();


}
}