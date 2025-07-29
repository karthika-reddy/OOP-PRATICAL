package lab1;
import java.util.*;
public class question3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number n: ");
    int n = sc.nextInt();
    System.out.println("\nSquare roots from 1 to " + n + " using Math.sqrt():");
    for (int i = 1; i <= n; i++) {
    double result = Math.sqrt(i);
    System.out.println("  " + result);
}
}
}
