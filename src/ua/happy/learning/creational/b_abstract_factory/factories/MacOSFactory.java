package ua.happy.learning.creational.b_abstract_factory.factories;

import ua.happy.learning.creational.b_abstract_factory.buttons.Button;
import ua.happy.learning.creational.b_abstract_factory.buttons.MacOSButton;
import ua.happy.learning.creational.b_abstract_factory.checkboxes.Checkbox;
import ua.happy.learning.creational.b_abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
