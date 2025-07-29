package lab1;
import java.util.*;
public class question6 {
public static void main(String[] args) {
	 Scanner letter = new Scanner(System.in);
     System.out.print("Enter a character: ");
     char ch = letter.next().charAt(0);
     char lower = Character.toLowerCase(ch);
     if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
             System.out.println(ch + " is a vowel.");
         } else {
             System.out.println(ch + " is a consonant.");
         }
     } else {
         System.out.println("Not an alphabet.");
     }	

	}

}
