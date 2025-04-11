public class task4{
public static void main(String[] args) {
int[] array = new int[10];
int i=0, num=1;
do{
array[i]= num*num;
num++;
i++;
}while (i<9);
array[9]=0;
System.out.print("Array: ");
for(int val : array) {
System.out.print(val + " ");
}
System.out.println();
int sum = 0, index= 0;
while(index < array.length) {
if(array[index] == 81) {
break;
}
if(array[index]%2!=0) {
sum+=array[index];
}
index++;
}      
System.out.println("Sum of odd numbers before encountering 81: " + sum);
}
}
