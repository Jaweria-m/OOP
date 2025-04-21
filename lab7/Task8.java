import java.util.Scanner;
class Task8{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any letter ..");


		String letter = input.nextLine();
		String[] arr= letter.split(" ");

		int count =0;

		for(String word :arr){
    System.out.println(word);
    count++;
		}

System.out.println("Number of words : "+count);
	}
}