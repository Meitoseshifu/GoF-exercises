package ua.happy.learning.creational.a_factory_method.factory;

import ua.happy.learning.creational.a_factory_method.buttons.Button;
import ua.happy.learning.creational.a_factory_method.buttons.LinuxButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
