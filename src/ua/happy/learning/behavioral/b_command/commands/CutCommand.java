package ua.happy.learning.behavioral.b_command.commands;

import ua.happy.learning.behavioral.b_command.editor.Editor;

public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
