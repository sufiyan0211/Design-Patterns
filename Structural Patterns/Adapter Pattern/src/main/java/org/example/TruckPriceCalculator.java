package org.example;

/**
 * @author sofiyan
 */
public class TruckPriceCalculator implements PriceCalculator{
    private int age;
    private String brand;
    private static final int defaultPrice = 1000000;
    private static final String currency = " USA";
    private static final int depreciatingPrice = 1000;

    public TruckPriceCalculator(String brand, int age) {
        this.brand = brand;
        this.age = age;
    }

    private int calculatePrice() {
        int brandFactor = 1;
        switch(brand) {
            case "Ashok" :
                brandFactor = 1;
                break;
            case "Tata":
                brandFactor = 2;
        }
        int price = (defaultPrice * brandFactor) - (age * depreciatingPrice);
        return price;
    }

    @Override
    public String getPrice() {
        return calculatePrice() + currency;
    }
}
