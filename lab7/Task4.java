import java.util.Scanner;
class Task4{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter any String : ");
		String word = input.nextLine();

		if(word.startsWith("Hi")){
			System.out.println("String starts with Hi ");
		}
		else
		{
			System.out.println("String does not starts with Hi");
		}
	}
}