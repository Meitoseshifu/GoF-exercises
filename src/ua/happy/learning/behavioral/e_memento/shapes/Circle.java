package ua.happy.learning.behavioral.e_memento.shapes;

import java.awt.*;

public class Circle extends BaseShape {
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
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
    public void paint(Graphics graphics) {

    }

}
