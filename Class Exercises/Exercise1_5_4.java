
// Patric Khiev
// 6/14/19
// Assignment 1.5.4

// Write a program oddeven.java where the user enters a number. 
// If number is odd, display:‘You entered an odd number’.
// If number is even, display:‘You entered an even number'.

import java.util.Scanner;

public class Exercise1_5_4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int userInput = input.nextInt();
    if (userInput == 0) {
      System.out.println("You entered zero, silly goose!");
    } else if (userInput < 0) {
      System.out.println("You entered a negative number");
    } else if (userInput % 2 == 0) {
      System.out.println("You entered an even number");
    } else {
      System.out.println("You entered an odd number");
    }
  }
}