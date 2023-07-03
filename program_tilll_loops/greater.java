import java.util.Scanner;

public class greater {
	public static void greaterno (int num1,int num2) {
		if(num1>num2) {
			System.out.println("num1 is greater i.e :"+num1);
		}else {
			System.out.println("num2 is greater i.e :"+num2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
	    int b = sc.nextInt();
	    
	    greaterno(a,b);

	}

}
