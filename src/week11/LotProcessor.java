package week11;

import java.util.ArrayList;
import java.util.Collections;

import week11.exception.NegativeMeasurementException;

public class LotProcessor {
    public static void main(String[] args)  {
        ArrayList<Lot> lotList = new ArrayList<>();
        
        try {
            Lot firstLot = new Lot("45654543", 12, 34, 12.44);
            System.out.println(firstLot);
            lotList.add(firstLot);
            firstLot = new Lot("1294", -12, 34, 12.44);
            lotList.add(firstLot);

            System.out.println(lotList);
            Collections.sort(lotList);
            System.out.println(lotList);

        } catch (NegativeMeasurementException e) {
            System.err.println(e.getMessage());
        }
    }
}
