// Name: Patric Khiev
// Date: 06/17/19
// Assignment: 1.6.3

// Write a program classify_age.java that asks the user to enter a person’s age. 
// Then the program should display text indicating whether the person is an infant, a toddler, a child, a teenager, an adult, or a senior. 
// It should display it just like this: “This person’s age category: x”, where x is the person’s age category based on:
// If less than 1 year old, the person is an infant.
// If at least 1 year old but younger than 3, the person is a toddler.
// If at least 3 years old but younger than 13, the person is a child.
// If at least 13 years old but younger than 18, the person is a teenager.
// If at least 18 years old but younger than 65, the person is an adult.
// If 65 or older, the person is a senior.

import java.util.Scanner;

public class Exercise1_6_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String inf = "infant";
    String todd = "toddler";
    String chld = "child";
    String teen = "teenage";
    String adlt = "adult";
    String sen = "senior";

    System.out.println("Enter your age");
    float userAge = input.nextFloat();
    if (userAge < 0) { // less than 0
      System.out.println("Silly goose, you're not born yet!");
    } else if (userAge < 1) { // less than one
      System.out.printf("This person’s age category: %s%n", inf);
      System.out.println(); // between 1 and 3
    } else if (userAge > 1 && userAge <= 3) {
      System.out.printf("This person’s age category: %s%n", todd);
      System.out.println(); // between 3 and 13
    } else if (userAge > 3 && userAge <= 13) {
      System.out.printf("This person’s age category: %s%n", chld);
      System.out.println();
    } else if (userAge > 13 && userAge <= 18) {
      System.out.printf("This person’s age category: %s%n", teen);
      System.out.println();
    } else if (userAge > 18 && userAge <= 65) {
      System.out.printf("This person’s age category: %s%n", adlt);
      System.out.println();
    } else if (userAge > 65) {
      System.out.printf("This person’s age category: %s%n", sen);
      System.out.println();
    }
    System.out.println("end of program");
  }
}