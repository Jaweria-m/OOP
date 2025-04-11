import java.util.Arrays;
public class task7{
public static void main(String[] args){
int[] array = {1,5,4,8,18,10,6};        
int min=array[0];
int max=array[0];        
for(int num:array) {
if(num<min){
min=num;
}
if(num>max){
max=num;
}
}
System.out.println("Smallest element: " + min);
System.out.println("Largest element: " + max);
if(max%2==0){
System.out.println("The largest element "+max+" is a multiple of 2.");
} else{
System.out.println("The largest element " + max + " is not a multiple of 2.");
}
}
} 