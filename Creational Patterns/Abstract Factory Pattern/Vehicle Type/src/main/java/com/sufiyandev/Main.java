package com.sufiyandev;

public class Main {
    public static void main(String[] args) {
        VehicleFactory ordinaryVehicle = new OrdinaryVehicle();
        Vehicle thar = ordinaryVehicle.getVehicle("mahindra");
        thar.drive();

        Vehicle swift = ordinaryVehicle.getVehicle("maruti");
        swift.drive();


        VehicleFactory luxuryCar = new LuxuryFactory();
        Vehicle roma = luxuryCar.getVehicle("ferrari");
        roma.drive();
    }
}