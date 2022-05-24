package ua.happy.learning.creational.b_abstract_factory;

import ua.happy.learning.creational.b_abstract_factory.app.Application;
import ua.happy.learning.creational.b_abstract_factory.factories.GUIFactory;
import ua.happy.learning.creational.b_abstract_factory.factories.LinuxFactory;
import ua.happy.learning.creational.b_abstract_factory.factories.MacOSFactory;

public class Demo {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        GUIFactory factory = System.getProperty("os.name")
                .toLowerCase()
                .contains("mac") ?  new MacOSFactory() : new LinuxFactory();
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
