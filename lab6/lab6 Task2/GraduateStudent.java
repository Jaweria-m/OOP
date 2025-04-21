class GraduateStudent extends Student{
String researchTopic;

GraduateStudent(String name, int age, String studentId, String researchTopic){
   super(name, age, studentId);
   this.researchTopic = researchTopic;
}
   public void displayInfo(){
     super.displayInfo();
     System.out.println("Research Topic: " + researchTopic);

 
}
}