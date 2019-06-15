
// Patric Khiev
// 6/14/19
// Assignment 1.4

import java.util.Scanner;

public class Exercise1_4_1 {
  public static void main(String[] args) {
    String aString = "abc";
    System.out.println("String output:"); // Expected:String output
    System.out.println("START1234567890"); // Expected:START1234567890
    System.out.printf("START%sEND %n", aString); // Expected:STARTabcEND
    System.out.printf("START%4sEND %n", aString); // Expected:START abcEND
    System.out.printf("START%2sEND %n", aString); // Expected:STARTabcEND
    System.out.println();
    char oneCharacter = 'Z';
    System.out.println("Character output:"); // Expected:Character output:
    System.out.println("START1234567890"); // Expected:START1234567890
    System.out.printf("START%cEND %n", oneCharacter); // Expected: STARTZEND
    System.out.printf("START%4cEND %n", oneCharacter); // Expected: START ZEND
    System.out.println();
    double d = 12345.123456789;
    System.out.println("Floating-point output:"); // Expected: Floating-point output:
    System.out.println("START1234567890"); // Expected:START1234567890
    System.out.printf("START%fEND %n", d);// Expected:START12345.123456789END
    System.out.printf("START%.4fEND %n", d);// Expected:START12345.1234END
    System.out.printf("START%.2fEND %n", d);// Expected:START12345.12END
    System.out.printf("START%12.4fEND %n", d);// Expected:START12345.1234END
    System.out.printf("START%eEND %n", d); // Expected:START1.2345123e+04END
    System.out.printf("START%12.5eEND %n", d);// Expected:START 1.23451e+04END
    String bString = "Jelly beans";
    System.out.println("START1234567890");// Expected:START1234567890
    System.out.printf("START%sEND %n", bString);// Expected:STARTJelly beansEND
    System.out.printf("START%4sEND %n", bString);// Expected:STARTJelly beansEND
    System.out.printf("START%13sEND %n", bString);// Expected:START Jelly beansEND
    System.out.println();
    String cString = "Jelly beans";
    double e = 123.1234567890;
    System.out.println("START1234567890");// Expected:START1234567890
    System.out.printf("START%sEND %n %9.4f %n", cString, e); // Expected: STARTJelly beansEND
                                                             // 123.1234
  }
}