public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 1, 5000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Doe", 2, 20.0, 100);

        double fullTimeSalary = fullTimeEmployee.calculateSalary();
        System.out.println("Full-time employee salary: " + fullTimeSalary);
        fullTimeEmployee.payTax(fullTimeSalary);

        double partTimeSalary = partTimeEmployee.calculateSalary();
        System.out.println("Part-time employee salary: " + partTimeSalary);
        partTimeEmployee.payTax(partTimeSalary);
    }
}