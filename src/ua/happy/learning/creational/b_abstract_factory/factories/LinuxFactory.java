package ua.happy.learning.creational.b_abstract_factory.factories;

import ua.happy.learning.creational.b_abstract_factory.buttons.Button;
import ua.happy.learning.creational.b_abstract_factory.buttons.LinuxButton;
import ua.happy.learning.creational.b_abstract_factory.checkboxes.Checkbox;
import ua.happy.learning.creational.b_abstract_factory.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
