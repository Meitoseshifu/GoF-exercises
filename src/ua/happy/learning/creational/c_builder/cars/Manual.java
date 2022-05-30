package ua.happy.learning.creational.c_builder.cars;

import ua.happy.learning.creational.c_builder.components.Engine;
import ua.happy.learning.creational.c_builder.components.GPSNavigator;
import ua.happy.learning.creational.c_builder.components.Transmission;
import ua.happy.learning.creational.c_builder.components.TripComputer;

/**
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. They are not related.
 */
public class Manual {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;
    private TripComputer tripComputer;

    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  GPSNavigator gpsNavigator, TripComputer tripComputer) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }

}
