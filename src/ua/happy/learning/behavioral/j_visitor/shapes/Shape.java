package ua.happy.learning.behavioral.j_visitor.shapes;

import ua.happy.learning.behavioral.j_visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
