import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" program started");
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,temp;
		System.out.println(" Enter 1st number");
		a= sc.nextInt();
		System.out.println(" Enter 2nd number");
		
		b= sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(" After Swapping value of a: "+a+" and b "+b);
		
	}

}
