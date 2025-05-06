public class PartTimeEmployee extends Employee implements TaxPayer {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    
    public void payTax(double salary) {
        double tax = salary * 0.05; 
        System.out.println(name + " paid tax: " + tax);
    }
}