package week12;

import week12.exception.ScaryException;

public class TestExceptions {
    public static void main(String[] args) {

        String test = "yes";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (ScaryException se) {
            System.err.println("scary exception");

        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");

    }

    public static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
    }

}
