package lab1;

import java.util.*; 

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill, gst, maintenance, discount, total;
        System.out.print("Enter base bill amount: ");
        bill = sc.nextDouble(); 
        gst = bill * 0.18;         
        maintenance = bill * 0.05; 
        double discount1 = bill + gst + maintenance;
        if (bill > 1000) {
            discount = discount1 * 0.10; 
        } else {
            discount = discount1 * 0.05; 
        }
        total = discount1 - discount;
        System.out.println("Base Bill: " + bill);
        System.out.println("GST (18%): " + gst);
        System.out.println("Maintenance (5%): " + maintenance);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}
