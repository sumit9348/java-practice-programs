import java.util.*;
public class factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the factorial of that number");
		
		int num = sc.nextInt();
		
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial *=i; 
		}
		System.out.println("Factorial is :"+factorial);
	}

}
