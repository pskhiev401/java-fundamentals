
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
    int tripMiles = input.nextInt();
    System.out.printf("Select desired passenger class:%n1 = First Class, 2= Second Class, 3 = Third Class%n");
    int cabinClass = input.nextInt();
    System.out.printf("total miles: %d%n", tripMiles);

    // Tier Calculations with Counters
    int tier1 = 0, tier2 = 0, tier3 = 0; // tiers initialized to zero

    for (int i = 0; i < tripMiles; i++) { // for loop iterates through tripMiles
      if (tripMiles <= 100 && tier1 == 0) { // less than 100mi
        tier1 = tripMiles;
        tripMiles = 0;
      } else if (tripMiles <= 100 && tier1 <= 100) { // between 100 - 250
        tier2 = tripMiles;
        tripMiles = 0;
      } else if (tripMiles >= 250) {// between 100 to 250mi
        tripMiles -= 100; // sub 100 from triptotal
        tier1 += 100; // +100 to tier1 counter
        tier2 = tripMiles;
        System.out.printf("tripMiles: %s%n", tripMiles);
        System.out.printf("tier1: %s%n", tier1);
        System.out.printf("tier2: %s%n", tier2);
      } else if (tripMiles > 100 && tier1 == 100 && tier2 < 150) { // tier 2 mileage
        tripMiles -= 150; // sub 150 from triptotal
        tier2 += 150; // +150 to tier2 counter
        System.out.printf("tripMiles: %s%n", tripMiles);
        System.out.printf("tier2: %s%n", tier2);
      } else if (tripMiles > 0 && tier1 == 100 && tier2 == 150) { // mileage beyond tier1 & tier2
        tier3 = tripMiles; // assigns tripmiles to tier3 counter
      }
    }
    System.out.println(tier3);

    switch (cabinClass) {
    case 1:
      if (tier3 > 0 && tier2 == 150 && tier1 == 100) { // Trips for beyond 250mi
        double firstClass3 = ((tier1 * 3) + (tier2 * 2.5) + (tier3 * 2));
        System.out.printf("First Class fare: %-6.2f %n", firstClass3);
      } else if (tier2 == 150 && tier1 == 100) { // Trips between 100mi - 250 mi
        double firstclass2 = ((tier2 * 2.5) + (tier3 * 2));
        System.out.printf("First Class fare: %-6.2f %n", firstclass2);

      } else if (tier1 <= 100) {
        double firstClass1 = tier1 * 3;
        System.out.printf("First Class fare: %-6.2f %n", firstClass1);
      }
      // case 2: if (tier3 == 0){

      // }
    }
  }
}
