
//Name: Patric Khiev
//Date: 6/10/19
//Assignment 1.1.2
import java.util.Scanner;

public class MathExercise2 {
	public static void main(String[] args) {
		Scanner RadiusInput = new Scanner(System.in); // RadiusInput is an object of the Scanner class
		float r; // r is the variable for radius
		System.out.println("Enter radius"); // prompt for input
		r = RadiusInput.nextFloat(); // assign input to r variable
		System.out.println("Area= " + 3.14 * r * r); // display area
		System.out.println("Circumference= " + 2 * 3.14 * r); // display circumference
	}
}