package org.example.lib;

import org.example.PriceCalculator;
import org.example.UKCarPriceCalculator;

/**
 * @author sofiyan
 */
public class UKCarPriceCalculatorAdapter implements PriceCalculator {

    private UKCarPriceCalculator ukCarPriceCalculator;
    private static final String currency = " GBP";

    public UKCarPriceCalculatorAdapter(UKCarPriceCalculator ukCarPriceCalculator) {
        this.ukCarPriceCalculator = ukCarPriceCalculator;
    }

    @Override
    public String getPrice() {
        return ukCarPriceCalculator.getPrice() + currency;
    }
}
