package ua.happy.learning.creational.c_builder.cars;

import ua.happy.learning.creational.c_builder.components.Engine;
import ua.happy.learning.creational.c_builder.components.GPSNavigator;
import ua.happy.learning.creational.c_builder.components.Transmission;
import ua.happy.learning.creational.c_builder.components.TripComputer;

/**
 * Car is a product class.
 */
public class Car {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final GPSNavigator gpsNavigator;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private double fuel = 0;

    public Car(Type type, int seats, Engine engine, GPSNavigator gpsNavigator,
               Transmission transmission, TripComputer tripComputer) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.gpsNavigator = gpsNavigator;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
