import java.util.*;
public class age {
	public static void agevote(int age) {
		if(age>18) {
			System.out.println("Allowed to vote");
		}else {
			System.out.println("Not Allowed to vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age Of The Person:");
		int age= sc.nextInt();
		
		agevote(age);

	}

}
