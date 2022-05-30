package ua.happy.learning.creational.c_builder.builders;

import ua.happy.learning.creational.c_builder.cars.Type;
import ua.happy.learning.creational.c_builder.components.Engine;
import ua.happy.learning.creational.c_builder.components.GPSNavigator;
import ua.happy.learning.creational.c_builder.components.Transmission;
import ua.happy.learning.creational.c_builder.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {

    @Override
    public void setType(Type type) {

    }

    @Override
    public void setSeats(int seats) {

    }

    @Override
    public void setEngine(Engine engine) {

    }

    @Override
    public void setTransmission(Transmission transmission) {

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {

    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {

    }
}
