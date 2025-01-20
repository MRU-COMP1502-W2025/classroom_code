package week02;

public class Week02 {
    public static void main(String[] args) {
        // example 1
        // int value = 3;

        // System.out.printf("Hello " + "World");
        // System.out.print("Hello " + "World\n");
        // System.out.println("Hello " + "World");

        // System.out.println("The value is: " +(5 + 7));
        // System.out.println("The value is: " + 5 + 7);
        // System.out.println("The value is: " + value );
        // System.out.println("The value is: " +value+ "+" +5);

        // example 1
        // System.out.println("This is printed out");
        // System.out.println("on two separate lines.");

        // example 2
        // System.out.print("These are our top sellers:\n");
        // System.out.print("\tComputer games\n\tCoffee\n");
        // System.out.println("\tAspirin");

        // example 3
        // She said  ”Hello Dale", 
        // he said 'I think I love you Sara.'.

        // example 4
        System.out.printf("This is printed out,\n%20s\n", "Hello World");

        int hours = 37;
        System.out.printf("The number of hours worked was %10d", hours);
       
        // 9:11 AM
        hours = 10;
        int minutes = 11;
        System.out.printf("\nThe time is %2d:%2d AM.", hours, minutes);

        double hours_worked = 37.488;
        System.out.printf("\nThe number of hours worked was %5d %10.2f.", hours, hours_worked);
    }
}