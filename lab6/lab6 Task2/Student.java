class Student extends Person{
    String studentId;
 
    Student(String name, int age, String studentId){
           super(name, age);
           this.studentId = studentId;
           } 
public void displayInfo(){
super.displayInfo();
System.out.println("Student ID: " + studentId);

}
 
}