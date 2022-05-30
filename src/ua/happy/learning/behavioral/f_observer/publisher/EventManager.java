package ua.happy.learning.behavioral.f_observer.publisher;

import ua.happy.learning.behavioral.f_observer.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listenersMap = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listenersMap.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listenersMap.get(eventType);
        eventListeners.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listenersMap.get(eventType);
        eventListeners.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> eventListeners = listenersMap.get(eventType);
        for (EventListener listener : eventListeners) {
            listener.update(eventType, file);
        }
    }
}
