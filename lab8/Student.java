public class Student {

    private String name;
    private int rollNumber;
    private char grade;

   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

   
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

   
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jaweria Mariam");
        student.setRollNumber(140);
        student.setGrade('A');
        student.displayDetails();

       
    }
}
