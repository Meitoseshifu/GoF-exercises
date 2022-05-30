package ua.happy.learning.behavioral.e_memento.commands;

import ua.happy.learning.behavioral.e_memento.editors.Editor;

import java.awt.*;

public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void execute() {

    }
}
