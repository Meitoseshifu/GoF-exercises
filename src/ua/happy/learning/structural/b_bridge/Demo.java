package ua.happy.learning.structural.b_bridge;

import ua.happy.learning.structural.b_bridge.devices.Device;
import ua.happy.learning.structural.b_bridge.devices.Radio;
import ua.happy.learning.structural.b_bridge.devices.Tv;

/**
 * Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into
 * two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
 *
 * Usage examples: The Bridge pattern is especially useful when dealing with cross-platform apps, supporting multiple
 * types of database servers or working with several API providers of a certain kind (for example, cloud platforms,
 * social networks, etc.)
 *
 * Identification: Bridge can be recognized by a clear distinction between some controlling entity and several
 * different platforms that it relies on.
 */
public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Test with basic remote");

        System.out.println("Test with advance remote");

    }
}
