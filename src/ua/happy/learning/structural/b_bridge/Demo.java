package ua.happy.learning.structural.b_bridge;

import ua.happy.learning.structural.b_bridge.devices.Device;
import ua.happy.learning.structural.b_bridge.devices.Radio;
import ua.happy.learning.structural.b_bridge.devices.Tv;
import ua.happy.learning.structural.b_bridge.remotes.AdvancedRemote;
import ua.happy.learning.structural.b_bridge.remotes.BasicRemote;

/**
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
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
