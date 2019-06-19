
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

    case 1: // First Class
      if (tripMiles <= 100) { // Trips less than or equal 100mi
        System.out.println(tripMiles * 3.0);
        break;
      } else if (tripMiles > 100 && tripMiles <= 250) { // Trips between 100mi - 250mi
        tripMiles -= 100; // removes 100 from tripMiles
        float tier1 = 100; // intialized to 100 which was removed from tripMiles
        float tier2 = tripMiles; // tier2 is set to the remainder
        double tripCost = (tier1 * 3) + (tier2 * 2.5); // rates calculation
        System.out.println(tripCost);
        break;
      } else if (tripMiles > 250) { // Trips greater than 250mi
        tripMiles -= 100; // removes 100 from tripMiles
        float tier1 = 100; // intialized to 100 which was removed from tripMiles
        tripMiles -= 150; // removes 150 from tripmMiles
        float tier2 = 150; // then added tier2
        float tier3 = tripMiles; // tier3 is set to the remainder miles
        double tripCost = (tier1 * 3) + (tier2 * 2.5) + (tier3 * 2); // rates calculation
        System.out.println(tripCost);
        break;
      }
    case 2: // Second Class
      if (tripMiles <= 100) { // Trips less than or equal 100mi
        System.out.println(tripMiles * 2.5);
        break;
      } else if (tripMiles > 100 && tripMiles <= 250) { // Trips between 100mi - 250mi
        tripMiles -= 100;
        float tier1 = 100;
        float tier2 = tripMiles;
        double tripCost = (tier1 * 2.5) + (tier2 * 1.5);
        System.out.println(tripCost);
        break;
      } else if (tripMiles > 250) {// Trips greater than 250mi
        tripMiles -= 100;
        float tier1 = 100;
        tripMiles -= 150;
        float tier2 = 150;
        float tier3 = tripMiles;
        double tripCost = (tier1 * 2.5) + (tier2 * 1.5) + (tier3 * 1);
        System.out.println(tripCost);
        break;
      }
    case 3: // Third Class
      if (tripMiles <= 100) { // Trips less than or equal 100mi
        System.out.println(tripMiles * 2);
        break;
      } else if (tripMiles > 100 && tripMiles <= 250) { // Trips between 100mi - 250mi
        tripMiles -= 100;
        float tier1 = 100;
        float tier2 = tripMiles;
        double tripCost = (tier1 * 2) + (tier2 * 1);
        System.out.println(tripCost);
        break;
      } else if (tripMiles > 250) { // Trips greater than 250mi
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
      System.out.println("Error, invalid input"); // Error for non-defined inputs
    }
    System.out.println("End of Program");
  }
}
