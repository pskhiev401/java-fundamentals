
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

The user should be allowed to repeat the operations as long as he wants to. Use appropriate number of parameters and return type for each method
*/

import java.util.Scanner;

public class InClass2_2_1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int userChoice;
    do {
      System.out.println("Choose a Program:");
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
      // System.out.println(userChoice);
      switch (userChoice) {
      case 1:
        System.out.println("Enter a number: ");
        int num1 = keyboard.nextInt();
        // System.out.println(num);
        SumSeries(num1);
        break;
      case 2:
        System.out.println("Enter a number: ");
        int num2 = keyboard.nextInt();
        // System.out.println(num);
        armstrongNum(num2);
        break;
      case 3:
        System.out.println("Enter a number: ");
        int num3 = keyboard.nextInt();
        PrimeNum(num3);
        break;
      // case 4:
      // System.out.println("Enter a number: ");
      // int num4 = keyboard.nextInt();
      // MultiplyNum_Tenx(num4);
      // break;
      // case 5:
      // System.out.println("Enter a number: ");
      // int num5 = keyboard.nextInt();
      // DigitDetails(num5);
      // break;
      // case 6:
      // System.out.println("Enter a number: ");
      // int num6 = keyboard.nextInt();
      // Palindrome(num6);
      // break;
      // case 7:
      // System.out.println("Enter a number: ");
      // int num7 = keyboard.nextInt();
      // factorial(num7);
      // break;
      // case 8:
      // System.out.println("Enter a base: ");
      // int base = keyboard.nextInt();
      // System.out.println("Enter an exponent: ");
      // int exponent = keyboard.nextInt();
      // ExponentEval(base, exponent);
      // break;
      case 9:
        System.out.println("Cya Later....");
        return;
      }
    } while (userChoice != 9);
  }

  public static void SumSeries(int number) {
    System.out.print("2^2"); // Prints our first set in the series
    int sum = 4; // initialized to 4, because 2^2 = 4
    for (int x = 4; x <= 2 * number; x += 2) { // determines sum & prints nth sets concatnated
      System.out.print(" + " + x + "^" + "2");
      sum += x * x;
    }
    System.out.println();
    System.out.println("Sum of terms= " + sum);
  }

  public static void armstrongNum(int number) {
    int result = 0;
    int temp; // temp holds original number value
    int num;

    temp = number;
    while (number > 0) {
      num = number % 10;
      number = number / 10;
      result += (num * num * num);
    }
    // System.out.println(result);
    if (result == temp) { // comparing the original number with the result
      System.out.println("This is an armstrong number.");
    } else {
      System.out.println("This is not an armstrong number.");
    }
  }

}
