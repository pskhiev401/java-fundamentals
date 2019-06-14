//Name: Patric Khiev
//Date: 6/10/19
//Assignment 1.1.1

import java.util.Scanner;

public class MathExercise1
{
	public static void main(String [] args)
	{
		Scanner Input= new Scanner(System.in); // Input is an object of the Scanner class
		int x; 
		float y;
		System.out.println("Enter first number"); // Diplay message for 1st input
		x=Input.nextInt(); // assigning input to x variable
		System.out.println("Enter second number"); 
		y=Input.nextFloat(); // assigning input to y variable
		System.out.println("sum= "+(x+y)); //display sum 
		System.out.println("difference= "+(x-y)); // display difference 
		System.out.println("product= "+ (x*y));  // display product 
		System.out.println("quotient= "+ (x/y)); // display quotient 
		System.out.println("remainder= "+(x%y)); // display modulo
	}
}