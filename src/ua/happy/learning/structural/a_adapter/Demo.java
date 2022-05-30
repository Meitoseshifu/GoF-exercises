package ua.happy.learning.structural.a_adapter;

import ua.happy.learning.structural.a_adapter.adapters.SquarePegAdapter;
import ua.happy.learning.structural.a_adapter.round.RoundHole;
import ua.happy.learning.structural.a_adapter.round.RoundPeg;
import ua.happy.learning.structural.a_adapter.square.SquarePeg;

/**
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 *
 * Examples from the real world:
 *  - java.util.Arrays#asList()
 *  - java.util.Collections#list()
 *  - java.util.Collections#enumeration()
 *  - java.io.InputStreamReader(InputStream) (returns a Reader object)
 *  - java.io.OutputStreamWriter(OutputStream) (returns a Writer object)
 *  - javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()
 */
public class Demo {

    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.

    }

}
