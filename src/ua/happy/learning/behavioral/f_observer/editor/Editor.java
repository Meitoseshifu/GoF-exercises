package ua.happy.learning.behavioral.f_observer.editor;

import ua.happy.learning.behavioral.f_observer.publisher.EventManager;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {

    }

    public void saveFile() throws Exception {

    }
}
