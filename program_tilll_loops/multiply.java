import java.util.*;
public class multiply {
	
	public static int multiplying(int a,int b) {
		int mul= a*b;
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
	    int b = sc.nextInt();
		 
		int product = multiplying(a,b);
		
		System.out.println("The Product Of Two Numbers Is :"+product);

	}

}
