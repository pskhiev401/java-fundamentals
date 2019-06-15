
// Patric Khiev
// 6/14/19
// Assignment 1.3.2

import java.util.Scanner;

public class Exercise1_3_2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String s1 = "Hello John";
    String s2 = "hello john";
    String s3 = "Hello John";
    String s4 = "Hello john";
    String s5 = "Hello John";
    String s6 = "Hello john";

    s1 = s1.toUpperCase();
    s2 = s2.toUpperCase();
    s3 = s3.toUpperCase();
    s4 = s4.toUpperCase();
    s5 = s5.toUpperCase();
    s6 = s6.toUpperCase();

    System.out.println(s1.equals(s2)); // Expected: True
    System.out.println(s3.equals(s4)); // Expected: True
    System.out.println(s5.equals(s6)); // Expected: True
  }
}