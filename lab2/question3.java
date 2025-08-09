package lab2;
import java.util.Date;
	public class question3 {
		public static void main(String[] args) {
		  Date now = new Date();
	        System.out.println("Current date & time: " + now);
	        System.out.println("Time in milliseconds since Jan 1, 1970: " + now.getTime());
	        System.out.println("Day of month: " + now.getDate());
	        System.out.println("Month (0-11): " + now.getMonth());
	        System.out.println("Year (since 1900): " + now.getYear());
	        System.out.println("Hours: " + now.getHours());
	        System.out.println("Minutes: " + now.getMinutes());
	        System.out.println("Seconds: " + now.getSeconds());
	    	}

}
