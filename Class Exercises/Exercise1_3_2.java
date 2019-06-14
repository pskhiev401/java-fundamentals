
// Patric Khiev
// 6/14/19
// Assignment 1.3.2

import java.util.Scanner;

public class Exercise1_3_2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String s1 = "Hello John";
    String s2 = "hello john";
    // String s3 = "Hello John";
    // String s4 = "Hello john";
    // String s5 = "Hello John";
    // String s6 = "Hello john";
    // System.out.println(s1.toUpperCase());
    // System.out.println(s2.toUpperCase());
    // System.out.println(s3.toUpperCase());
    // System.out.println(s4.toUpperCase());
    // System.out.println(s5.toUpperCase());
    // System.out.println(s6.toUpperCase());
    // Expected: "HELLO JOHN" x6
    s1 = s1.toUpperCase();
    s2 = s2.toUpperCase();
    System.out.println(s1); // Expected: HELLO JOHN
    System.out.println(s2); // Expected: HELLO JOHN
  }
}