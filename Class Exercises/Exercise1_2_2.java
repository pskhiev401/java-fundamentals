
// Name: Patric Khiev
// Date: 6/12/19
// Assignment: Exercise 1.2.2

import java.util.Scanner;

public class Exercise1_2_2 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in); // userInput is an object of the Scanner class
    double interestRate = 1.0299; // 2.99% = 1 + 0.0299 = 1.0299
    int years = 10;
    System.out.println("Enter desired future $ amount: ");
    int futureValue = userInput.nextInt(); // userInput is set to futureValue
    double presentValue = futureValue / (Math.pow(interestRate, years)); // forumla is ... P = F/(1+r)^n
    System.out.println("Present-day value deposit needed: " + presentValue);
  }
}
