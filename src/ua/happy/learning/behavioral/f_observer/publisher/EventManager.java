package ua.happy.learning.behavioral.f_observer.publisher;

import ua.happy.learning.behavioral.f_observer.listeners.EventListener;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {

    }

    public void subscribe(String eventType, EventListener listener) {

    }

    public void unsubscribe(String eventType, EventListener listener) {

    }

    public void notify(String eventType, File file) {

    }
}
