import java.util.Scanner;
class Task6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter any word : ");
		String word = input.nextLine();

		if(word.contains("Java")){
			System.out.println("String contains Java . ");
		}
		else
		{
			System.out.println("String does not contains Java .");
		}
	}
}