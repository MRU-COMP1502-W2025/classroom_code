package week11.exception;

/**
 * 
 */
public class NegativeMeasurementException extends Exception {
    
    /**
     * 
     */ 
    public NegativeMeasurementException() {
        super("ERROR: measurements cannot be negative!");
        System.err.println("say hello...");
    }

    /**
     * 
     * @param measurement
     */
    public NegativeMeasurementException(double measurement) {
        super("ERROR: measurements cannot be negative, and you provided: " +measurement);
    }

    /**
     * 
     * @param measurement
     */
    public NegativeMeasurementException(int measurement) {
        // super("ERROR: measurements cannot be negative, and you provided: "  + measurement);
        this((double)measurement);
    }
}