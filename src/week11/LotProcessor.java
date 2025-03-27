package week11;

import java.util.ArrayList;


import week11.exception.NegativeMeasurementException;

public class LotProcessor {
    public static void main(String[] args) {
        ArrayList<Lot> lotList = new ArrayList<>();
        
        try {
            Lot firstLot = new Lot("1234543", 12, 34, 12.44);
            lotList.add(firstLot);
            firstLot = new Lot("1294", -12, 34, 12.44);
            lotList.add(firstLot);

        } catch (NegativeMeasurementException e) {
            System.err.println(e.getMessage());
        }
    }
}
