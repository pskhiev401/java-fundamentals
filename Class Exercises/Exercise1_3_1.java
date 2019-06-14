
// Name: Patric Khiev
// Date: 6/12/19
// Assignment: Exercise 1.3.1

import java.util.Scanner;

public class Exercise1_3_1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String greeting = "How do you do";
    System.out.println(greeting + "Seven of Nine"); // Expected: "How do you doSeven of Nine"
    String test = "abcdefg";
    System.out.println(test.length()); // Expected: 7
    System.out.println(test.charAt(1)); // Expected: "b"
    System.out.println(test.substring(3)); // Expected: "defg"
    System.out.println("abc\ndef"); // Expected: "abc", newline: "def"
    System.out.println("abc\\ndef"); // Expected: "abc\ndef"
    String test2 = "Hello John";
    test2 = test2.toUpperCase();
    System.out.println(test2); // Expected: "HELLO JOHN"
  }
}
