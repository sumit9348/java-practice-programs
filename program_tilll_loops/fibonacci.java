import java.util.Scanner;

public class fibonacci {
	public static int fibo(int num) {
		int fibonacci = 1;
		for(int i=1;i<=num;i++) {
			fibonacci =fibonacci*i;
		}
		return fibonacci;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		int a =  sc.nextInt();
		
		int fibonacci=fibo(a);
		System.out.println("Fibonacci number of the number :"+fibonacci);
		
	}

}
