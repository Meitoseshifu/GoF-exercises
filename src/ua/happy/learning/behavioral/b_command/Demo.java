package ua.happy.learning.behavioral.b_command;

import ua.happy.learning.behavioral.b_command.editor.Editor;

/**
 * Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information
 * about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s
 * execution, and support undoable operations.
 *
 * Examples from real world:
 *  - all implementations of java.lang.Runnable
 *  - all implementations of javax.swing.Action
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
