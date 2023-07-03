import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("ENTER TO KNOW WHEATHER THE YEAR IS A LEAP YEAR OR NOT : ");
			int year=sc.nextInt();
			boolean leapisprime=( (year%4==0) && (year%100!=0) || (year%400==0));
			
			if(leapisprime) {
				System.out.println(year+"Is  Leap year");
			}else {
				System.out.println(year+" Is Not Leap year");
			}
		}

	}

}
