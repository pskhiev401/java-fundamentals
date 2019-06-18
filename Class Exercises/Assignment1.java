// Patric Khiev
// 6/17/19
// Assignment 1.1

/* Write a java program bill.java, that inputs the name, quantity, and price of three items. 
The name may contain spaces. Output a bill with a tax rate of 6.25%. All prices should be output to two decimal places. 
The bill should be formatted in columns with 30 characters for the name, 10 characters for the quantity, 10 characters for the price, and 10 characters for the total. 
Sample input and output are shown as follows: 

Input name of item 1: 
lollipops
Input quantity of item 1: 
10
Input price of item 1: 
0.50
Input name of item 2: 
diet soda
Input quantity of item 2: 
3
Input price of item 2: 
1.25
Input name of item 3: 
chocolate bar
Input quantity of item 3: 
20
Input price of item 3: 
0.75
Your bill:
Item             Quantity   Price   Total
lollipops        10         0.50    5.00
diet soda        3          1.25    3.75
chocolate bar    20         0.75    15.00
Subtotal                            23.75
6.25% sales tax                     1.48
Total                               25.23
*/
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompts for user to order items, quantity and price
    System.out.println("Input name of item 1:");
    String item1 = input.next();
    System.out.println("Input quantity of item 1:");
    int quant1 = input.nextInt();
    System.out.println("Input price of item 1:");
    float price1 = input.nextFloat();
    System.out.println("Input name of item 2:");
    String item2 = input.next();
    System.out.println("Input quantity of item 2:");
    int quant2 = input.nextInt();
    System.out.println("Input price of item 2:");
    float price2 = input.nextFloat();
    System.out.println("Input name of item 3:");
    String item3 = input.next();
    System.out.println("Input quantity of item 3:");
    int quant3 = input.nextInt();
    System.out.println("Input price of item 3:");
    float price3 = input.nextFloat();

    // Cost Calculation Section
    float itemCost1 = quant1 * price1;
    float itemCost2 = quant2 * price2;
    float itemCost3 = quant3 * price3;
    // System.out.println(itemCost1);
    // System.out.println(itemCost2);
    // System.out.println(itemCost3);
    float itemSubtotal = itemCost1 + itemCost2 + itemCost3;
    double taxRate = 0.0625;
    double salesTax = itemSubtotal * taxRate;
    double totalCost = itemSubtotal + salesTax;
    // System.out.println(itemSubtotal);
    // System.out.println(taxRate);
    // System.out.println(salesTax);
    // System.out.println(totalCost);

    // Formatted Bill Output
    System.out.println("Your bill:");
    System.out.printf("%-30s %-10s %-10s %10s%n", "Item", "Quantity", "Price", "Total");
    System.out.printf("%-30s %-10d %-10.2f %10.2f%n", item1, quant1, price1, itemCost1);
    System.out.printf("%-30s %-10d %-10.2f %10.2f%n", item2, quant2, price2, itemCost2);
    System.out.printf("%-30s %-10d %-10.2f %10.2f%n%n", item3, quant3, price3, itemCost3);
    System.out.printf("%-30s %-10s %-10s %10.2f%n", "Subtotal", "", "", itemSubtotal);
    System.out.printf("%-30s %-10s %-10s %10.2f%n", "6.25% sales tax", "", "", salesTax);
    System.out.printf("%-30s %-10s %-10s %10.2f%n", "Total", "", "", totalCost);

  }
}
