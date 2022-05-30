package ua.happy.learning.creational.c_builder.builders;

import ua.happy.learning.creational.c_builder.cars.Type;
import ua.happy.learning.creational.c_builder.components.Engine;
import ua.happy.learning.creational.c_builder.components.GPSNavigator;
import ua.happy.learning.creational.c_builder.components.Transmission;
import ua.happy.learning.creational.c_builder.components.TripComputer;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
public class CarManualBuilder implements Builder {

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
