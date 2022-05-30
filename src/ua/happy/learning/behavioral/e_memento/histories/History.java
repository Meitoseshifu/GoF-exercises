package ua.happy.learning.behavioral.e_memento.histories;

import ua.happy.learning.behavioral.e_memento.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Pair> history = new ArrayList<>();
    private int virtualSize = 0;

    private class Pair {
        Command command;
        Memento memento;

        Pair(Command c, Memento m) {
            command = c;
            memento = m;
        }

        private Command getCommand() {
            return command;
        }

        private Memento getMemento() {
            return memento;
        }
    }

    public void push(Command c, Memento m) {

    }

    public boolean undo() {
        return true;
    }

    public boolean redo() {
        return true;
    }

    private Pair getUndo() {
        return null;
    }

    private Pair getRedo() {
        return null;
    }

}
