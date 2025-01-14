package week02;

public class Raise
{
     public static void main(String[] args)
     {
        double salary = 11.50;
        double raiseInCents = 50;
        double newSalary;
        
        newSalary = salary + raiseInCents / 100;
           
        System.out.println( "New Salary is $" + newSalary );
     }
}