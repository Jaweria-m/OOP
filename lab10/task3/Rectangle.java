public class Rectangle extends Shape implements Printable{
   private double width;
   private double height; 

public Rectangle (double width, double height){
  this.width = width;
  this.height = height;
}
public double area(){
  return width*height; 
}

public void print (){
  System.out.println("This is a rectangle with width. " + width + "and height." + height);
}



}