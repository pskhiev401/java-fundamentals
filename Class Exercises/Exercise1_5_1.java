// Patric Khiev
// 6/14/19
// Assignment 1.5

// Write a  program preference.java to (2 points):-
// Ask the user ‘How much do you like pizza on a scale of 1 (hate) to 5 (love)?’
// Ask the user ‘How much do you like tacos on a scale of 1 (hate) to 5 (love)?’
// If users like pizza more than tacos print ‘You like pizzas more than tacos’. (You do not need an else condition)

import java.util.Scanner;

public class Exercise1_5_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How much do you like pizza on a scale of 1 (hate) to 5 (love)?");
    int pizzaScore = input.nextInt();
    System.out.println("How much do you like tacos on a scale of 1 (hate) to 5 (love)?");
    int tacoScore = input.nextInt();
    String food1 = "pizzas";
    String food2 = "tacos";
    if (pizzaScore > tacoScore) {
      System.out.printf("You like %s more than %s %n", food1, food2);
    }
    if (tacoScore > pizzaScore) {
      System.out.printf("You like %s more than %s %n", food2, food1);
    }
  }
}