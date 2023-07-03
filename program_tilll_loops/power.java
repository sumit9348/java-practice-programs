import java.util.*;
public class power {
	public static int powerofnumber(int x, int n) {
		int power=1;
		for(int i=0; i<n;i++) {
			power=power*x;
		}
		return power;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter The DENOMINATOR");
		int input1 = sc.nextInt();
		
		System.out.println("Enter The EXPONENT");
		int input2 = sc.nextInt();
		
		int pow =powerofnumber(input1,input2);
		
	    System.out.println("Power is :"+pow);
		
	}

}
