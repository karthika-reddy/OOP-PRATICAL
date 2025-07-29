package lab1;

public class question2 {
	public static void main(String[] args) {
		int tom = 3;
		int jerry = 5;
		System.out.println("Before swapping:");
	    System.out.println("Tom has " + tom + " apples");
	    System.out.println("Jerry has " + jerry + " apples");
	        int temp = tom;
	        tom = jerry;
	        jerry = temp;
	        System.out.println("After swapping:");
	        System.out.println("Tom has " + tom + " apples");
	        System.out.println("Jerry has " + jerry + " apples");
	}
}
