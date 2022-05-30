package ua.happy.learning.behavioral.e_memento.shapes;

import java.awt.*;

public abstract class BaseShape implements Shape {
    int x, y;
    private int dx = 0, dy = 0;
    private Color color;
    private boolean selected = false;

    BaseShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    void enableSelectionStyle(Graphics graphics) {

    }

    void disableSelectionStyle(Graphics graphics) {

    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void drag() {

    }

    @Override
    public void drop() {

    }

    @Override
    public void moveTo(int x, int y) {

    }

    @Override
    public void moveBy(int x, int y) {

    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        return false;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void setColor(Color color) {

    }

    @Override
    public void select() {

    }

    @Override
    public void unSelect() {

    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public void paint(Graphics graphics) {

    }
}
