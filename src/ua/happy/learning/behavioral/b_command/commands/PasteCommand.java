package ua.happy.learning.behavioral.b_command.commands;

import ua.happy.learning.behavioral.b_command.editor.Editor;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
