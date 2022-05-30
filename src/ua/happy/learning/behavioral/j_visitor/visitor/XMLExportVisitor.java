package ua.happy.learning.behavioral.j_visitor.visitor;

import ua.happy.learning.behavioral.j_visitor.shapes.Circle;
import ua.happy.learning.behavioral.j_visitor.shapes.CompoundShape;
import ua.happy.learning.behavioral.j_visitor.shapes.Dot;
import ua.happy.learning.behavioral.j_visitor.shapes.Rectangle;

public class XMLExportVisitor implements Visitor {

    @Override
    public String visitDot(Dot dot) {
        return null;
    }

    @Override
    public String visitCircle(Circle circle) {
        return null;
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return null;
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
        return null;
    }
}
