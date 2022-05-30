package ua.happy.learning.creational.a_factory_method.factory;

import ua.happy.learning.creational.a_factory_method.buttons.Button;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    protected Button createButton() {
        return null;
    }
}
