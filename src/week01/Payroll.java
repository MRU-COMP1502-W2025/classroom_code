package week01;

import java.util.Scanner;

public class Payroll {
  /**
   * 
   * @param args - some comment about the argument
   */
  public static void main(String[] args) {
    double hours = 40;
    double grossPay;
    double payRate = 0;
    // String name = new String("");
    String name = "";

    // code added in class
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name, how many hours did you work, and what was your pay rate?");
    // String inputLine = sc.nextLine();

    name = sc.next();
    hours = sc.nextDouble();
    payRate = sc.nextDouble();
    // end of code added in class

    grossPay = hours * payRate;
    System.out.println(name + " your gross pay is $" + grossPay);

    // code added in class
    // System.out.println(1000 / 38);
    // System.out.println(1000 % 38);
    // System.out.println(1000.0 / 38);
    // end of code added in class
  }
}