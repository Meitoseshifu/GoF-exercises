package ua.happy.learning.structural.c_composite;

import ua.happy.learning.structural.c_composite.editor.ImageEditor;
import ua.happy.learning.structural.c_composite.shapes.Circle;
import ua.happy.learning.structural.c_composite.shapes.CompoundShape;
import ua.happy.learning.structural.c_composite.shapes.Dot;
import ua.happy.learning.structural.c_composite.shapes.Rectangle;

import java.awt.*;

/**
 * Composite examples from standard Java library:
 * - java.awt.Container#add(Component) (practically all over Swing components)
 * - javax.faces.component.UIComponent#getChildren() (practically all over JSF UI components)
 */
public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Circle(275, 275, 25, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
