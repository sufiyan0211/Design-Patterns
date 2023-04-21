package com.sufiyandev;

public class OrdinaryVehicle implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String type) {
        switch(type) {
            case "maruti":
                return new Maruti();
            case "mahindra":
                return new Mahindra();
        }
        return null;
    }
}
