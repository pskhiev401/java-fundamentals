
// Name: Patric Khiev
// Date: 06/16/19
// Assignment: 1.6.2

// Write a program water.java that asks for temperature in Fahrenheit. The program should accept any floating point number. 
// Display whether water is liquid, solid, or gas at that temperature at sea level. Display the results like this: “Water at that temperature is a solid/liquid/gas.” 
// (Note: display only the correct state for that temperature.)
// Facts: At sea level, water freezes at 32 degrees F and boils at 212 degrees F. (4 points)

// Extra credit: 1 point if you convert the temperatures to celsius when printing.

import java.util.Scanner;

public class Exercise1_6_2 {
  public static void main(String[] args) {
    Scanner converter = new Scanner(System.in);
    System.out.println("Input degrees in Farenheit");
    float tempInput = converter.nextFloat();
    System.out.println(tempInput);
    if (tempInput <= 32) {
      System.out.println("Water at that temperature is a solid");
    } else if (tempInput < 212 && tempInput > 32) {
      System.out.println("Water at that temperature is a liquid");
    } else {
      System.out.println("Water at that temperature is a gas");
    }
    System.out.println("Degrees in Celsius: " + ((tempInput - 32) / (1.8)));
  }
}