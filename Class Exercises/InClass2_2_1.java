
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
7. Factorial Finder
8. Exponent Evaluation

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
      System.out.println("6. Palindrome Test");
      System.out.println("7. factorial Finder");
      System.out.println("8. Exponent Evaluator");
      System.out.println("9. Quit Program");
      userChoice = keyboard.nextInt();
      // System.out.println(userChoice);
      switch (userChoice) {
      case 1:
        System.out.println("Enter a number: ");
        int num1 = keyboard.nextInt();
        // System.out.println(num);
        sumSeries(num1);
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
        primeNum(num3);
        break;
      case 4:
        System.out.println("Enter a number: ");
        int num4 = keyboard.nextInt();
        findNext10(num4);
        break;
      case 5:
        System.out.println("Enter a number: ");
        int num5 = keyboard.nextInt();
        digitDetails(num5);
        break;
      case 6:
        System.out.println("Enter a number: ");
        int num6 = keyboard.nextInt();
        palindrome(num6);
        break;
      case 7:
        System.out.println("Enter a number: ");
        int num7 = keyboard.nextInt();
        factorial(num7);
        break;
      case 8:
        System.out.println("Enter a positive integer base: ");
        int base = keyboard.nextInt();
        System.out.println("Enter a positive integer exponent: ");
        int exp = keyboard.nextInt();
        exponentEval(base, exp);
        break;
      case 9:
        System.out.println("Cya Later....");
      }
    } while (userChoice != 9);
  }

  public static void sumSeries(int number) {
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
    while (number > 0) { // numbers greater than 0
      num = number % 10;
      number = number / 10;
      result += (num * num * num);
    }
    // System.out.println(result);
    if (result == temp) { // comparing the original number with the result, if equal then its an Armstrong
      // == is appropraite since were evaluating ints
      System.out.println("This is an armstrong number.");
    } else {
      System.out.println("This is not an armstrong number.");
    }
  }

  public static void primeNum(int number) {
    // prime numbers are not divisible by other numbers, but 1 and itself.
    int num = number;
    boolean primeCheck = false;
    for (int i = 2; i <= num / 2; ++i) { // checking nonprime number
      if (num % i == 0) {
        primeCheck = true; // switches boolean value
      }
    }
    if (primeCheck) { // if true
      System.out.println(num + " is not a prime number.");
    } else { // if false
      System.out.println(num + " is a prime number.");
    }
  }

  public static void findNext10(int number) {
    int result;
    for (int i = 1; i <= 10; i++) {
      result = number * i;
      System.out.println(number + " x " + i + " = " + result);
    }
  }

  public static void digitDetails(int number) {
    int digit;
    int num;
    int evenSum = 0;
    int oddSum = 0;
    int evenCounter = 0;
    int oddCounter = 0;
    while (number > 0) {
      digit = number / 10;
      num = number - digit * 10;
      number = digit;
      if (num % 2 == 0) { // checking if num is an even digit
        evenSum = evenSum + num;
        evenCounter++;
      } else if (num % 2 != 0) { // checking if num is an odd digit
        oddSum = oddSum + num;
        oddCounter++;
      }
    }
    System.out.println("Sum of even digits = " + evenSum);
    System.out.println("Sum of odd digits = " + oddSum);
    System.out.println("Number of even digits = " + evenCounter);
    System.out.println("Number of odd digits = " + oddCounter);
  }

  public static void palindrome(int number) {
    int reversedInt = 0, remainder;
    int temp;
    if (number <= 0) { // catch error for numbers 0 or less
      System.out.println(number + " is an invalid entry to find palindrome.");
    }
    temp = number;
    while (number != 0) { // numbers must be greater than 0
      remainder = number % 10;
      reversedInt = reversedInt * 10 + remainder;
      number /= 10;
    }
    if (reversedInt == temp) {
      System.out.println(temp + " is a palindrome.");
    } else {
      System.out.println(temp + " is not a palindrome.");
    }
  }

  public static void factorial(int number) {
    int result = 1;
    System.out.print(number + "! = ");
    if (number == 0 || number == 1) { // factorial of 0 or 1 is always 1
      result = 1;
      System.out.print(result);
    }
    // start the loop if number is greater than 1
    String symbol = "x";
    for (int i = 1; i <= number; i++) {
      if (i == number) // does not concatenate multiplication sign for last number.
      {
        symbol = "";
      }
      System.out.print(i + symbol);
    }
    System.out.println();
  }

  public static void exponentEval(long base, long exp) {
    long result = base;
    System.out.print(base + " to the power of " + exp + " is ");
    if (exp == 0) { // if exponent = 0, return 1
      result = 1;
      System.out.println(result);
    }
    if (exp == 1) { // if exponent = 1, return base
      System.out.println(result);
    }
    for (int i = 2; i <= exp; i++) { // loops performs multiplacation nth times, basically base ^ nth
      result *= base;
    }
    System.out.println(result);
  }
}