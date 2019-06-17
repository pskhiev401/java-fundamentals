
// Patric Khiev
// 6/17/19
// Assignment 2.1.2

/* Write a program that allows the user to convert a temperature given in degrees 
from either Celsius to Fahrenheit or Fahrenheit to Celsius. 
Use the following formulas: 

Degrees_C = 5(Degrees_F− 32)/9
Degrees_F = (9(Degrees_C)/5) + 32)

Prompt the user to enter a temperature and either a C or c for Celsius or an F 
or f for Fahrenheit. Convert the temperature to Fahrenheit if Celsius is entered, 
or to Celsius if Fahrenheit is entered. Display the result in a readable format. 
If anything other than C, c, F, or f is entered, print an error message and stop.
*/

import java.util.Scanner;

public class Example2_1_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.printf("Choose temperature unit do you have?%n c = Celisus, f = Farenheit%n");
    String userInput = input.next();
    System.out.println("Enter temperature ");
    float userTemp = input.nextFloat();
    switch (userInput) {
    case "f":
    case "F":
      System.out.println("Degrees in Celsius: " + ((userTemp - 32) / (1.8)));
      break;
    case "c":
    case "C":
      System.out.println("Degrees in Farenheit: " + ((userTemp * 1.8) + 32));
      break;
    default:
      System.out.println("Error, invalid input");
    }
  }
}