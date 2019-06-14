/*Example5.java
  Author- Anita Rathi
  This program demonstrates  :
  - %,  modulus/remainder operator
  - int data type
  - nextInt()
  - Implicit Conversion
  - Explicit Conversion

 */

import java.util.Scanner;

public class Example5
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in); //Input is an object of Scanner class
		int num1;
		// byte x=200;
		float num2;
		System.out.println("Enter first number:");//Displaying prompt
		num1=Input.nextInt();//Input.nextInt() is used for reading integer number from console
		//Here Input is an object and nextInt() is a method
		System.out.println("Enter second number:");
		num2=Input.nextFloat();
		// This statement shows implicit conversion
		float sum=num1+num2;//+ is the addition operator
		//= is the assignment operator
		int remainder=num1%(int)num2;
		// % cannot be used with floating point numbers
		// This statement shows explicit conversion or type casting
		System.out.println("Sum=" + sum);//Displaying string literal and variable's value
		System.out.println("Remainder=" + remainder);
	}
}