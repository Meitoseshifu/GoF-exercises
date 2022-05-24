package ua.happy.learning.creational.a_factory_method.factory;

import ua.happy.learning.creational.a_factory_method.buttons.Button;
import ua.happy.learning.creational.a_factory_method.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
