import java.util.*;
public class Lcm {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM INITIATED");
		System.out.println("Enter The First Number");
		a= sc.nextInt();
		System.out.println("Enter The Second Number");
		b=sc.nextInt();
		
		int max = Math.max(a, b);
		
		while(true) {
			if(max%a==0 && max%b==0) {
				break;
			}
			max++;
		}
		System.out.println("lcm is: "+max) ; 	
	}
}
		

    
	
