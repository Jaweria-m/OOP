import java.util.Scanner;
class Book{
String Tittle;
String Author;
boolean isAvailable;

Book(String Tittle,String Author){
this.Tittle=Tittle;
this.Author=Author;
isAvailable = true;
}

void BorrowBook(){
isAvailable=false;

if(isAvailable){
System.out.print("Book is Available!");

}
else{
System.out.println("Book is not already borrowed!");

}
}

void ReturnBook(){
if(isAvailable){

}
else{
isAvailable=true;
}

}
void Displayinfo(){
System.out.println("Tittle of book: "+Tittle);
System.out.println("Author of book: "+Author);
System.out.println("Availability:   "+isAvailable);

}

public static void main(String args[]){
Book b1=new Book("Atomic Habits","James Clear");

b1.Displayinfo();
b1.BorrowBook();
b1.Displayinfo();



}
}