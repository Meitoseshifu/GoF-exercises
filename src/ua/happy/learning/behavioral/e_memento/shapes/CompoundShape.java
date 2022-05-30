package ua.happy.learning.behavioral.e_memento.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
    private List<Shape> children = new ArrayList<>();

    public CompoundShape(Shape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(Shape component) {
    }

    public void add(Shape... components) {
    }

    public void remove(Shape child) {
    }

    public void remove(Shape... components) {
    }

    public void clear() {
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
        int maxWidth = 0;
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        return maxHeight;
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
    public void setColor(Color color) {

    }

    @Override
    public void unSelect() {

    }

    public Shape getChildAt(int x, int y) {
        return null;
    }

    public boolean selectChildAt(int x, int y) {
        return false;
    }

    public List<Shape> getSelected() {
        List<Shape> selected = new ArrayList<>();
        return selected;
    }

    @Override
    public void paint(Graphics graphics) {

    }

}
