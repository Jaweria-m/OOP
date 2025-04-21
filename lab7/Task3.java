import java.util.Scanner; 
 class Task3{
    public static void main (String[] args){
         Scanner input = new Scanner (System.in);
    String arr[] = new String [5];
System.out.println("Enter five string: ");

for(int i=0; i<arr.length; i++){
arr[i]=input.nextLine();
	}

	System.out.println("Upper cased : ");

	for(int i =0;i<arr.length;i++){
		System.out.println(arr[i].toUpperCase());	
	}
       
}
}