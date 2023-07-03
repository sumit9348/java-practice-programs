import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		int a,b,gcd=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM INITIATED");
		System.out.println("Enter The First Number");
		a= sc.nextInt();
		System.out.println("Enter The Second Number");
		b=sc.nextInt();
		
		int smaller = Math.min(a, b);
		
		for(int i=smaller;i>=1;i-- ) {
			if(a%i==0 && b%i==0) {
				gcd=i;
				break;
			}
		}
		System.out.println(+gcd);
	}

}
