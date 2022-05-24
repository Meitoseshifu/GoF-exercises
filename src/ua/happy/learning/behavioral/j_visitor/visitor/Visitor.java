package ua.happy.learning.behavioral.j_visitor.visitor;

import ua.happy.learning.behavioral.j_visitor.shapes.Circle;
import ua.happy.learning.behavioral.j_visitor.shapes.CompoundShape;
import ua.happy.learning.behavioral.j_visitor.shapes.Dot;
import ua.happy.learning.behavioral.j_visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
