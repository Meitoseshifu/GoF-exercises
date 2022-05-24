package ua.happy.learning.creational.b_abstract_factory.factories;

import ua.happy.learning.creational.b_abstract_factory.buttons.Button;
import ua.happy.learning.creational.b_abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
