
// Patric Khiev
// 6/14/19
// Assignment 1.5.2
// Write a  program sort_names.java where the user enters two names and you print them in sorted order, 
// lowest to highest (lowest means the word with the lowest UNICODE code value, e.g., Mark < Mary ).
// You should print it in the format: firstname, secondname.  

import java.util.Scanner;

public class Exercise1_5_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a name");
    String name1 = input.next();
    System.out.println("Enter another name?");
    String name2 = input.next();
  }
} 