package ua.happy.learning.behavioral.b_command.commands;

import ua.happy.learning.behavioral.b_command.editor.Editor;

public abstract class Command {

    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {

    }

    public void undo() {

    }

    public abstract boolean execute();
}
