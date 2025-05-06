public class FullTimeEmployee extends Employee implements TaxPayer{
  private double monthlySalary;

public FullTimeEmployee (String name, int id, double monthlySalary){
  super(name,id);
  this.monthlySalary = monthlySalary;
}

public double calculateSalary(){
return monthlySalary;
}
public void payTax (double salary){
      double tax = salary*0.1;
System.out.println(name + "paidntax: " + tax);
}

} 