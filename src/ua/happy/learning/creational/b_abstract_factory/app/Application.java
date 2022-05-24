package ua.happy.learning.creational.b_abstract_factory.app;

import ua.happy.learning.creational.b_abstract_factory.buttons.Button;
import ua.happy.learning.creational.b_abstract_factory.checkboxes.Checkbox;
import ua.happy.learning.creational.b_abstract_factory.factories.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
