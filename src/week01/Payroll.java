package week01;

import java.util.Scanner;

public class Payroll {
  /**
   * 
   * @param args - some comment about the argument
   */
  public static void main(String[] args) {
    int hours = 40;
    double grossPay;
    double payRate = 25.0;

    // code added in class
    Scanner sc = new Scanner(System.in);
    System.out.println("How many hours did you work?");
    hours = sc.nextInt();
    // end of code added in class


    grossPay = hours * payRate;
    System.out.println("Your gross pay is $" + grossPay);

    // code added in class
    // System.out.println(1000 / 38);
    // System.out.println(1000 % 38);
    // System.out.println(1000.0 / 38);
    // end of code added in class
  }
}