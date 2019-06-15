
// Patric Khiev
// 6/14/19
// Assignment 1.4

import java.util.Scanner;

public class Exercise1_4_1 {
  public static void main(String[] args) {
    String aString = "abc";
    System.out.println("String output:");
    System.out.println("START1234567890");
    System.out.printf("START%sEND %n", aString);
    System.out.printf("START%4sEND %n", aString);
    System.out.printf("START%2sEND %n", aString);
    System.out.println();
    char oneCharacter = 'Z';
    System.out.println("Character output:");
    System.out.println("START1234567890");
    System.out.printf("START%cEND %n", oneCharacter);
    System.out.printf("START%4cEND %n", oneCharacter);
    System.out.println();
    double d = 12345.123456789;
    System.out.println("Floating-point output:");
    System.out.println("START1234567890");
    System.out.printf("START%fEND %n", d);
    System.out.printf("START%.4fEND %n", d);
    System.out.printf("START%.2fEND %n", d);
    System.out.printf("START%12.4fEND %n", d);
    System.out.printf("START%eEND %n", d);
    System.out.printf("START%12.5eEND %n", d);
    String bString = "Jelly beans";
    System.out.println("START1234567890");
    System.out.printf("START%sEND %n", bString);
    System.out.printf("START%4sEND %n", bString);
    System.out.printf("START%13sEND %n", bString);
    System.out.println();
    String cString = "Jelly beans";
    double e = 123.1234567890;
    System.out.println("START1234567890");
    System.out.printf("START%sEND %n %9.4f %n", cString, e);
  }
}