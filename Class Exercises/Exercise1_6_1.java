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
    // Prompt user for type of currency, and how much
    System.out.printf(
        "Which currency would you like to convert to USD? %ne = Euros, c = Chinese Yuan, r = Indian Rupees, b = Bitcoin: ");
    String selectedCurrency = converter.next();
    System.out.println(selectedCurrency);
    if (selectedCurrency.equals("e")) { // in java we need to use the .equals(), versus using ==
      System.out.println("Amount of Euros to convert: ");
    } else if (selectedCurrency.equals("c")) {
      System.out.println("Amount of Yuan to convert: ");
    } else if (selectedCurrency.equals("r")) {
      System.out.println("Amount of Rupees to convert: ");
    } else if (selectedCurrency.equals("b")) {
      System.out.println("Amount of Bitcoin to convert: ");
    } 
    // Currency conversion logic
    float currencyAmt = converter.nextFloat();
    if (selectedCurrency.equals("e")) {
      System.out.println("In U.S. dollars, that is " + currencyAmt * 1.16);
    } else if (selectedCurrency.equals("c")) {
      System.out.println("In U.S. dollars, that is " + currencyAmt * 0.15);
    } else if (selectedCurrency.equals("r")) {
      System.out.println("In U.S. dollars, that is " + currencyAmt * 0.015);
    } else if (selectedCurrency.equals("b")) {
      System.out.println("In U.S. dollars, that is " + currencyAmt * (1 / 6923.80));
    }
  }
}