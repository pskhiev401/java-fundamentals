
// Patric Khiev
// 6/17/19
// Assignment 1.2

/*
Write a Java program calculate_fare.java to take the input for number of miles, and the class of journey (1,2, or 3, for first, second, and third class respectively), for a train journey.

The program should then calculate and display the fare of journey based on the following criteria:
Note: Use Switch...case and if...else construct

                  First (1) Class     Second (2) Class    Third (3) Class

First 100 mile    $ 3 per mile        $ 2 per mile        $ 1.50 per mile

Next 150 mile     $ 2.50 per mile     $ 1.50 per mile     $ 1 per mile

Remaining         $ 2 per mile        $ 1 per mile        $ 0.50 per mile

*/

import java.util.Scanner;

public class Assignment1_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input total miles of your destination: ");
    float tripMiles = input.nextInt();
    System.out.printf("Select desired passenger class:%n1 = First Class, 2= Second Class, 3 = Third Class%n");
    int cabinClass = input.nextInt();

    switch (cabinClass) {

    case 1:
      if (tripMiles <= 100) {
        System.out.println(tripMiles * 3.0);
        break;
      } else if (tripMiles > 100 && tripMiles <= 250) {
        tripMiles -= 100;
        float tier1 = 100;
        float tier2 = tripMiles;
        double tripCost = (tier1 * 3) + (tier2 * 2.5);
        System.out.println(tripCost);
        break;
      } else if (tripMiles > 250) {
        tripMiles -= 100;
        float tier1 = 100;
        tripMiles -= 150;
        float tier2 = 150;
        float tier3 = tripMiles;
        double tripCost = (tier1 * 3) + (tier2 * 2.5) + (tier3 * 2);
        System.out.println(tripCost);
        break;
      }
    case 2:
      if (tripMiles <= 100) {
        System.out.println(tripMiles * 2.5);
        break;
      } else if (tripMiles > 100 && tripMiles <= 250) {
        tripMiles -= 100;
        float tier1 = 100;
        float tier2 = tripMiles;
        double tripCost = (tier1 * 2.5) + (tier2 * 1.5);
        System.out.println(tripCost);
        break;
      } else if (tripMiles > 250) {
        tripMiles -= 100;
        float tier1 = 100;
        tripMiles -= 150;
        float tier2 = 150;
        float tier3 = tripMiles;
        double tripCost = (tier1 * 2.5) + (tier2 * 1.5) + (tier3 * 1);
        System.out.println(tripCost);
        break;
      }
    case 3:
      if (tripMiles <= 100) {
        System.out.println(tripMiles * 2);
        break;
      } else if (tripMiles > 100 && tripMiles <= 250) {
        tripMiles -= 100;
        float tier1 = 100;
        float tier2 = tripMiles;
        double tripCost = (tier1 * 2) + (tier2 * 1);
        System.out.println(tripCost);
        break;
      } else if (tripMiles > 250) {
        tripMiles -= 100;
        float tier1 = 100;
        tripMiles -= 150;
        float tier2 = 150;
        float tier3 = tripMiles;
        double tripCost = (tier1 * 2) + (tier2 * 1) + (tier3 * 0.5);
        System.out.println(tripCost);
        break;
      }
    default:
      System.out.println("Error, invalid input");
    }
    System.out.println("End of Program");
  }
}
