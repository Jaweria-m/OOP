import java.util.*;

public class lab9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Reverse a String
        System.out.print("Enter a string to reverse: ");
        String input1 = scanner.nextLine();
        System.out.println("Reversed string: " + reverseString(input1));

        // Task 2: Palindrome Checking
        System.out.print("\nEnter a string to check if it's a palindrome: ");
        String input2 = scanner.nextLine();
        if (isPalindrome(input2)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        // Task 3: Longest Substring Without Repeating Characters
        System.out.print("\nEnter a string to find the longest substring without repeating characters: ");
        String input3 = scanner.nextLine();
        String longest = longestUniqueSubstring(input3);
        System.out.println("Longest unique substring: " + longest);
        System.out.println("Length: " + longest.length());

        // Task 4: Count Vowels and Consonants
        System.out.print("\nEnter a string to count vowels and consonants: ");
        String input4 = scanner.nextLine();
        countVowelsAndConsonants(input4);

        // Task 5: Prime Number Detection in Range
        int min = 10;
        int max = 25;
        int prime = generateRandomPrime(min, max);
        if (prime != -1) {
            System.out.println("\nA prime number between " + min + " and " + max + " is: " + prime);
        } else {
            System.out.println("\nNo prime number found between " + min + " and " + max);
        }

        // Task 6: Frequency Count of Random Numbers
        System.out.println("\nFrequency of 100 random numbers (0 to 20):");
        countRandomFrequencies();
    }

    // Task 1
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Task 2
    public static boolean isPalindrome(String str) {
        String reversed = "";
        String original = str.toLowerCase().replaceAll("\\s+", "");
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        return original.equals(reversed);
    }

    // Task 3
    public static String longestUniqueSubstring(String str) {
        String current = "", longest = "";
        for (char ch : str.toCharArray()) {
            String s = String.valueOf(ch);
            if (current.contains(s)) {
                current = current.substring(current.indexOf(s) + 1);
            }
            current += s;
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }

    // Task 4
    public static void countVowelsAndConsonants(String str) {
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Task 5
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int generateRandomPrime(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1;
    }

    // Task 6
    public static void countRandomFrequencies() {
        Random rand = new Random();
        int[] count = new int[21];

        for (int i = 0; i < 100; i++) {
            int number = rand.nextInt(21); // from 0 to 20 inclusive
            count[number]++;
        }

        for (int i = 0; i <= 20; i++) {
            System.out.println(i + " appeared " + count[i] + " times.");
        }
    }
}
