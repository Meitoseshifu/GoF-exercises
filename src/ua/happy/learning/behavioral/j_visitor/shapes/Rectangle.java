package ua.happy.learning.behavioral.j_visitor.shapes;

import ua.happy.learning.behavioral.j_visitor.visitor.Visitor;

public class Rectangle implements Shape {

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(Visitor visitor) {
        return null;
    }
}
