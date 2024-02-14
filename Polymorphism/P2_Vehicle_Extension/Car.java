package P2_Vehicle_Extension;

import java.util.ArrayList;
import java.util.List;

public class Car extends VehicleImpl{
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        super.setFuelConsumption(fuelConsumption + 0.9);
    }


}
