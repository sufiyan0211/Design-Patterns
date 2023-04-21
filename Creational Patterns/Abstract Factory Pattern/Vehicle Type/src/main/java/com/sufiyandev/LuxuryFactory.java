package com.sufiyandev;

public class LuxuryFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        switch(type) {
            case "mercedes":
                return new Mercedes();
            case "ferrari":
                return new Ferrari();
        }
        return null;
    }
}
