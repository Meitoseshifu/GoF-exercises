package ua.happy.learning.behavioral.f_observer.listeners;

import java.io.File;

public class LogOpenListener implements EventListener {
    private final File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.printf("Save to log %s: Someone has performed %s operation with the following file: %s%n",
                log, eventType, file.getName());
    }
}
