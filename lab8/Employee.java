public class Employee {

    public int calculateBonus(int salary) {
        return (int)(0.10 * salary);
    }

    public int calculateBonus(int salary, int extraHours) {
        return (int)(0.10 * salary) + (extraHours * 500);
    }

   
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        System.out.println(emp.calculateBonus(50000));       
        System.out.println(emp.calculateBonus(50000, 3));    
    }
}
