import java.util.Scanner;
class Task7{
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String letter .");

		String letter= input.nextLine();
		
		String modified = letter.replace(" ","");

		System.out.println("Replaced and modified : "+modified);
	}
}