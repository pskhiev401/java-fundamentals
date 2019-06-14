
// Name: Patric Khiev
// Date: 6/12/19
// Assignment: Exercise 1.2.1

// 1 hour = 3600s or input/60/60
// 1 min = 60s or (input/60)%60
// remaning secs = input%60

import java.util.Scanner;

public class Exercise1_2 {
  public static void main(String[] args) {
    Scanner UserInput = new Scanner(System.in); // UserInput is an object of the Scanner class
    int input; // initializing input at integer
    System.out.print("Enter Seconds: "); // prompt for user to enter # seconds for conversion
    input = UserInput.nextInt(); // assigning userinput to input variable
    int sec = input % 60; // finding how many seconds, mins, hours
    int min = (input / 60) % 60;
    int hour = (input / 60) / 60;
    System.out.println("Hours= " + hour); // displaying hours, mins, seconds
    System.out.println("Minutes= " + min);
    System.out.println("Seconds= " + sec);
  }
}