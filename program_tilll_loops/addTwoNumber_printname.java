import java.util.*;
public class addTwoNumber_printname {
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}
	
	public static int addition(int a,int b) {
		int result;
		result=a+b;
		return result;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter the first number :");
		int a =  sc.nextInt();
		
		System.out.println("Enter the first number :");
		int b =  sc.nextInt();
	
		printMyName(name);
		
		int add=addition(a,b);
		System.out.println(add);
		
	}

}
