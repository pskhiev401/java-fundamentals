//Name: Patric Khiev
//Date: 6/10/19
//Assignment 1.1.3
import java.util.Scanner; 

public class MathExercise3
{
	public static void main(String [] args)
	{
		Scanner NumberSwap = new Scanner(System.in);
		int a, b;
		System.out.print("Enter first number: ");
		a = NumberSwap.nextInt();
		System.out.print("Enter second number: ");
		b = NumberSwap.nextInt();
		System.out.println("Original First="+a);
		System.out.println("Original Second="+b);
		System.out.println("Modified First="+b);
		System.out.println("Modified Second="+a);
	}
}