package ua.happy.learning.creational.b_abstract_factory.app;

import ua.happy.learning.creational.b_abstract_factory.buttons.Button;
import ua.happy.learning.creational.b_abstract_factory.checkboxes.Checkbox;
import ua.happy.learning.creational.b_abstract_factory.factories.GUIFactory;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }
}
