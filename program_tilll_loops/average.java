import java.util.*;
public class average {
	public static double avg(int a, int b , int c) {
		double average= (a+b+c)/3;
		System.out.println(average);
		return average;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		int x =  sc.nextInt();
		
		System.out.println("Enter the second number :");
		int y =  sc.nextInt();
		
		System.out.println("Enter the third number :");
		int z =  sc.nextInt();
		
		System.out.println("Average of the 3 numbers are :"+avg(x,y,z));

	}

}
