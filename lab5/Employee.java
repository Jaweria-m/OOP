import java.util.Scanner;
class Employee{
String name;
int empID;
double salary;

Employee(String name, int empID, double salary){

this.name=name;
this.empID=empID;
this.salary=salary;
}
void increase_sal(double amount){
salary+=amount;
System.out.println("Increased Salary: "+amount);
}

void Cal_Sal(){
System.out.print("Anual Salary: "+salary*12);

}

void Displayinfo(){
System.out.println("Employee Name: "+name);
System.out.println("Employee ID:   "+empID);
System.out.println("Salary:        "+salary);

}

public static void main(String args[]){

Employee e1=new Employee("Jaweria Mariam",200,0000);

e1.increase_sal(20000);
e1.Displayinfo();
e1.Cal_Sal();

}
}