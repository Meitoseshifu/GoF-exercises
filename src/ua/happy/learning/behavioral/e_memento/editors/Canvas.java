package ua.happy.learning.behavioral.e_memento.editors;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Canvas extends java.awt.Canvas {
    private Editor editor;
    private JFrame frame;
    private static final int PADDING = 10;

    Canvas(Editor editor) {
        this.editor = editor;
        createFrame();
        attachKeyboardListeners();
        attachMouseListeners();
        refresh();
    }

    private void createFrame() {

    }

    private void attachKeyboardListeners() {

    }

    private void attachMouseListeners() {

    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    void refresh() {

    }

    public void update(Graphics g) {
    }

    public void paint(Graphics graphics) {

    }

}
