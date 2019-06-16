// Name: Patric Khiev
// Date: 06/16/19
// Assignment: 1.6.1

// Write a program (convert_money.java) that prompts the user like this: 
// “Currency to convert to U.S. dollars: e = Euros, c= Chinese Yuan, r = Indian Rupees, b = Bitcoin: ”. 
// Then depending on which letter the user enters, the program displays “Amount of Euros/Yuan/Rupees/Bitcoin to convert: ”. 
// (Note: the second prompt should only name the one currency the user asked to convert, not all four currencies.) 
// After the user enters the amount, the program displays “In U.S. dollars, that is $N”, (N is the amount converted to U.S. dollars). 

// 1 Euro = 1.16 US dollar   
// 1 Chinese yuan = 0.15 US dollar
// 1 Indian rupee = 0.015 US dollar
// 1 Bitcoin = 6923.80 US dollar

import java.util.Scanner;

public class Exercise1_6_1 {
  public static void main(String[] args) {
    Scanner converter = new Scanner(System.in);
    System.out.println("Currency to convert to U.S. dollars: e = Euros, c= Chinese Yuan, r = Indian Rupees, b = Bitcoin: ");
    float usDollar = converter.nextFloat();
  }
}