import java.util.*;
public class radiusCircle {
	public static void circumference (double radius) {
		double circumference = 2*3.14*radius;
		System.out.println("Circle Circumference :"+circumference);
		double area = 3.14*radius*radius;
		System.out.println("Circle area :"+area);
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of circle :");
		double x =  sc.nextDouble();
		circumference(x);
	}

	
}
