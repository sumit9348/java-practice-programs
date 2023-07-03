import java.util.*;
public class sumodd {
	public static double sumoddno(double num) {
		int sum=0;
		for(int i=1;i<=num;i=i+2) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number upto which you want to diplay odd number :");
		int number = sc.nextInt();
		
		double num = sumoddno(number);
		
		System.out.println(num);
		
	}

}
