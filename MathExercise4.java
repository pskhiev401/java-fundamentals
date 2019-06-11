//Name: Patric Khiev
//Date: 6/10/19
//Assignment 1.1.4

import java.util.Scanner;

public class MathExercise4
{
	public static void main(String [] args)
	{
		Scanner TempInput = new Scanner(System.in);
		float c;
		System.out.print("Enter degrees Celsius: ");
		c = TempInput.nextFloat();
		System.out.println("Fahrenheit= "+((1.8*c)+32));
	}
}