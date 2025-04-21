import java.util.Scanner;
   class Task1{
       public static void main (String[] args){
            Scanner input = new Scanner (System.in);
       System.out.println("Enter Sentence: ");
   String sentence = input.nextLine();
   
        if(sentence.isEmpty()){
             System.out.println ("String is empty");
        }
         else{
             System.out.println ("String is not empty");
        }
}
 }