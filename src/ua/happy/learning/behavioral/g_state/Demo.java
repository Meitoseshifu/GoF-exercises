package ua.happy.learning.behavioral.g_state;

import ua.happy.learning.behavioral.g_state.ui.Player;
import ua.happy.learning.behavioral.g_state.ui.UI;

/**
 * State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.
 * It appears as if the object changed its class.
 *
 * Examples from real world:
 * javax.faces.lifecycle.LifeCycle#execute() (controlled by the FacesServlet: behavior is dependent on current phase
 * (state) of JSF lifecycle)
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
