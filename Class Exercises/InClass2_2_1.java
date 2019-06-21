
// Patric Khiev
// 6/19/19
// Assignment 2.2.1
/* 
Write a menu driven program which uses a method for each of the following operations:
1. Sum of Series
2. Armstrong Number 
3. Prime/Composite 
4. Find 10 Multiples
5. Odd/Even Digit Details
6. Palindrome Test
7. Exponent Evaluation

(Note : The user should be allowed to repeat the operations as long as he wants to. Use appropriate number of parameters and return type for each method.)
*/

import java.util.Scanner;

public class InClass2_2_1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int userChoice;
    do {
      System.out.println("Choose a program:");
      System.out.println("1. Sum of Series");
      System.out.println("2. Armstrong Number");
      System.out.println("3. Prime/Composite Test");
      System.out.println("4. Find 10 Multiples");
      System.out.println("5. Odd/Even Digit Details");
      System.out.println("5. Palindrome Test");
      System.out.println("6. Factorial Finder");
      System.out.println("7. Exponent Evaluator");
      System.out.println("8. Quit Program");
      userChoice = keyboard.nextInt();
      System.out.println(userChoice);

      switch (userChoice) {
      case 1:
        // case 2:
        // case 3:
        // case 4:
        // case 5:
        // case 6:
        // case 7:

      }

    } while (userChoice != 8);
  }
  public static int SumSeries(int n){
    return sum;
  }

}
