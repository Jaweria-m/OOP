import java.util.Scanner;
public class circle2{

String color;
double radius;

circle2(String color, double radius){

this.radius=radius;
this.color=color;
}

double calculateArea(){
double area=(int)(3.14*radius*radius);
return area;
}

public static void main(String args[]){
circle2 green_circle=new circle2("green",3.3);
circle2 red_circle=new circle2("red",4.4);

System.out.println(red_circle.radius);
System.out.println(green_circle.radius);

green_circle.calculateArea();
red_circle.calculateArea();
}
}