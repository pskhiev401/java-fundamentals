// Patric Khiev
// 6/12/19
// Assignment 1.2 Extra Credit

/*Write a program to take the input of amount in Dollars, and then display the denominations in  $10, $1, $ 5, 50 cents, quarter, dime, and pennies which make up the total amount.
For example : amount=157.86
$ 10 =15
$ 5 =1
$ 1 =2
50 cents =1
Quarters= 1
Dime=1
Penny=1
*/

import java.util.Scanner;

public class Exercise1_2_EC {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter Dollar amount: ");
    float total = keyboard.nextFloat();
    // Ten Dollar Bills
    float tens = (total % 10);
    System.out.println("$10 Bills: " + tens);

  }
}