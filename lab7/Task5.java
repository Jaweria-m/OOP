import java.util.Scanner;
 class Task5{
 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter any word : ");
		String word = input.nextLine();

		if(word.endsWith("World")){
			System.out.println("String ends with World ");
		}
		else
		{
			System.out.println("String does not ends with World");
		}
	}
 }