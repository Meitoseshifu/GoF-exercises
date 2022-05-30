package ua.happy.learning.behavioral.e_memento.commands;

import ua.happy.learning.behavioral.e_memento.editors.Editor;

public class MoveCommand implements Command {
    private Editor editor;
    private int startX, startY;
    private int endX, endY;

    public MoveCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public String getName() {
        return null;
    }

    public void start(int x, int y) {

    }

    public void move(int x, int y) {

    }

    public void stop(int x, int y) {

    }

    @Override
    public void execute() {

    }

}
