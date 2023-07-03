import java.util.Scanner;

public class neonnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int sum=0;
		int square=number*number;
		while(square>0) {
			int digit = square%10;
			sum+=digit;
			square=square/10;	
		}
		if (number == sum) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
		
	}

}
}


