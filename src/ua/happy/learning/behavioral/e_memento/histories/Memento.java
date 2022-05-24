package ua.happy.learning.behavioral.e_memento.histories;

import ua.happy.learning.behavioral.e_memento.editors.Editor;

public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
