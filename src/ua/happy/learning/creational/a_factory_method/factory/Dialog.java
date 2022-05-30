package ua.happy.learning.creational.a_factory_method.factory;

import ua.happy.learning.creational.a_factory_method.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public  void renderWindow() {

    }

    protected abstract Button createButton();
}
