// Patric Khiev
// 6/17/19
// Assignment 2.1

// Write a program that reads a one-line sentence as input and then displays the following response: 
// If the sentence ends with a question mark (?) and the input contains an even number of characters, display the word Yes. 
// If the sentence ends with a question mark and the input contains an odd number of characters, display the word No. 
// If the sentence ends with an exclamation point (!), display the word Wow. 
// In all other cases, display the words You always say followed by the input string enclosed in quotes. 
// Your output should all be on one line. Be sure to note that in the last case, your output must include quotation marks around the echoed input string. 
// In all other cases, there are no quotes in the output. 
// Your program does not have to check the input to see that the user has entered a legitimate sentence. 

import java.util.Scanner;

public class Example2_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a one-line sentence");
    String userSentence = input.nextLine();
    // System.out.println(userSentence);
    int strLength = (userSentence.length());
    // System.out.println(strLength);
    String lastCharacter = userSentence.substring(strLength - 1, strLength);
    System.out.println(lastCharacter);
    if (lastCharacter.equals("?") && strLength % 2 == 0) {
      System.out.println("Yes");
    } else if (lastCharacter.equals("?") && strLength % 2 != 0) {
      System.out.println("No");
    } else if (lastCharacter.equals("!")) {
      System.out.println("Wow");
    }
  }
}