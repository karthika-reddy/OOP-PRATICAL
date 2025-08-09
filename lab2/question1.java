package lab2;
import java.util.Scanner;
public class question1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Length of string: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        if (str.length() >= 5) {
            System.out.println("Substring (index 1 to 5): " + str.substring(1, 5));
        } else {
            System.out.println("Substring cannot be shown (string too short)");
        }
        System.out.println("Contains 'java'? " + str.contains("java"));
        System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));
        sc.close();
    }
}
