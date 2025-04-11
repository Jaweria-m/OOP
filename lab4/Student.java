class Student{
    int id;
    String name;
    double[] grades;

public Student(int id, String name, double[] grades){
     this.id = id;
     this.name = name;
     this.grades = grades;
}

 public void displayAverageGrade(){
     double sum=0;
     for(double grade : grades){
     sum += grade;
}
double average = sum/grades.length;
System.out.printf("Average grade of %s: %.2f%n", name, average);
}

public double[] calcPercentage(){
     double[] percentages = new double[grades.length];
     for (int i = 0; i < grades.length; i++) {
     percentages[i] = (grades[i] / 200) * 100;
}
     return percentages;
}
public String concatIdName(){
     return id+"_"+name;
}
public static void main(String[] args){
     
      Student student1 = new Student(140, "Jaweria", new double[]{176, 124, 191, 180, 198});
      Student student2 = new Student(141, "Mariam", new double[]{134, 170, 195, 186, 143});

student1.displayAverageGrade();
student2.displayAverageGrade();
      
System.out.print("Percentages for " + student1.name + ": ");
        for (double percentage : student1.calcPercentage()) {
System.out.printf("%.2f%% ", percentage);
}
System.out.println();

System.out.print("Percentages for " + student2.name + ": ");
        for (double percentage : student2.calcPercentage()) {
System.out.printf("%.2f%% ", percentage);
}
System.out.println();

System.out.println("Concatenated ID and Name for " + student1.name + ": "+student1.concatIdName());
System.out.println("Concatenated ID and Name for " + student2.name + ": "+student2.concatIdName());

System.out.println("Student1's ID: " +student1.id);
System.out.println("Student2's name: "+ student2.name);}
}