package week01;

public class Payroll {
	/**
     * 
     * @param args - some comment about the argument
     */
    public static void main( String[] args ) {
		int hours = 40;
		double grossPay;
		double payRate = 25.0;

		grossPay = hours * payRate;
		System.out.println("Your gross pay is $" + grossPay);

        // some comment here
        short variable1 = -32768;
        System.out.println(variable1);
        /*
         * more comments here
         * and here
         * and here...
         */
        variable1--;
        System.out.println(variable1);

	}
}