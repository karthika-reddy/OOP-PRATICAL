package lab2;
import java.util.Scanner;
public class question2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Using equals(): Strings are EQUAL");
        } else {
            System.out.println("Using equals(): Strings are NOT equal");
        }
        if (str1 == str2) {
            System.out.println("Using == : Strings are EQUAL");
        } else {
            System.out.println("Using == : Strings are NOT equal");
        }
        sc.close();
    }
}
