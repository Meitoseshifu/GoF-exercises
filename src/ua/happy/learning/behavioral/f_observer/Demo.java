package ua.happy.learning.behavioral.f_observer;

import ua.happy.learning.behavioral.f_observer.editor.Editor;
import ua.happy.learning.behavioral.f_observer.listeners.EmailNotificationListener;
import ua.happy.learning.behavioral.f_observer.listeners.LogOpenListener;

/**
 * Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects
 * about any events that happen to the object they’re observing.
 *
 * Here are some examples of the pattern in core Java libraries:
 *     java.util.Observer/java.util.Observable (rarely used in real world)
 *     All implementations of java.util.EventListener (practically all over Swing components)
 *     javax.servlet.http.HttpSessionBindingListener
 *     javax.servlet.http.HttpSessionAttributeListener
 *     javax.faces.event.PhaseListener *
 * Identification: The pattern can be recognized by subscription methods, that store objects in a list and by calls to
 * the update method issued to objects in that list. *
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.eventManager.subscribe("open", new EmailNotificationListener("admin@example.com"));
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
