import java.util.Scanner;
public class BankAccount{
int balance;
String Accountno;


BankAccount(int balance, String Accountno){
this.balance=balance;
this.Accountno=Accountno;

}

void deposit(double amount){
this.balance+=amount;
}

double checkbalance(){
return this.balance;
}

void withdraw(double withdraw_amount){
if(this.balance<withdraw_amount){
System.out.print("Infufficant Fund!");
}
else{
this.balance-=withdraw_amount;
}
}

public static void main(String args[]){

BankAccount acc1=new BankAccount(1000,"abc");
BankAccount acc2=new BankAccount(500,"hey");

acc1.deposit(500);
acc2.deposit(1000);
acc1.withdraw(300);
System.out.println(acc1.checkbalance());
acc2.withdraw(3500);
}

}