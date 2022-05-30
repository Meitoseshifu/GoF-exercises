package ua.happy.learning.creational.a_factory_method.factory;

import ua.happy.learning.creational.a_factory_method.buttons.Button;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class LinuxDialog extends Dialog {

    @Override
    protected Button createButton() {
        return null;
    }
}
