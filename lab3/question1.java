package lab3;
import java.util.Scanner;
public class question1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();     
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
