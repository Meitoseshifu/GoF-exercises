package ua.happy.learning.creational.b_abstract_factory.factories;

import ua.happy.learning.creational.b_abstract_factory.buttons.Button;
import ua.happy.learning.creational.b_abstract_factory.checkboxes.Checkbox;

public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Checkbox createCheckbox() {
        return null;
    }
}
