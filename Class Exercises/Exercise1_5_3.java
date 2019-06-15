
// Patric Khiev
// 6/14/19
// Assignment 1.5
// Write a program ages.java where the user enters their age and their friend’s age. 
// If the user’s age is bigger or equal to their friend’s age print ‘You are older or the same age as your friend’.
// If the friend is older print ‘Your friend is older than you.  

import java.util.Scanner;

public class Exercise1_5_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your age?");
    int userAge = input.nextInt();
    System.out.println("What is your friend's age?");
    int friendAge = input.nextInt();
    if (userAge >= friendAge) {
      System.out.println("You are older or the same age as your friend");
    } else {
      System.out.println("Your friend is older than you");
    }
  }
}