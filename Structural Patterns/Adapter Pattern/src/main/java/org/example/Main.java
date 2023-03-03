package org.example;

import org.example.lib.UKCarPriceCalculatorAdapter;

/**
 * @author sofiyan
 */
public class Main {
    private static void printPrice(PriceCalculator priceCalculator) {
        System.out.println(priceCalculator.getPrice());
    }
    public static void main(String[] args) {
        CarPriceCalculator carPriceCalculator = new CarPriceCalculator("Maruti", 2);
        printPrice(carPriceCalculator);

        TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator("Ashok", 3);
        printPrice(truckPriceCalculator);

        // Need of Adapter pattern for supporting 3rd party lib i.e. UkCarPriceCalculator
        UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("Ford",3);
        UKCarPriceCalculatorAdapter ukCarPriceCalculatorAdapter = new UKCarPriceCalculatorAdapter(ukCarPriceCalculator);
        printPrice(ukCarPriceCalculatorAdapter);
    }


}