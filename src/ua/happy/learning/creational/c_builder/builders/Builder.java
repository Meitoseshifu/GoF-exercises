package ua.happy.learning.creational.c_builder.builders;

import ua.happy.learning.creational.c_builder.cars.Type;
import ua.happy.learning.creational.c_builder.components.Engine;
import ua.happy.learning.creational.c_builder.components.GPSNavigator;
import ua.happy.learning.creational.c_builder.components.Transmission;
import ua.happy.learning.creational.c_builder.components.TripComputer;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using the
 * same construction code.
 *
 * Builder interface defines all possible ways to configure a product *
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
