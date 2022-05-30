package ua.happy.learning.behavioral.a_chain_of_responsibility;

import ua.happy.learning.behavioral.a_chain_of_responsibility.notifiers.*;

/**
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
 * Upon receiving a request, each handler decides either to process the request or to pass it to the next handler
 * in the chain
 *
 * Here are some examples of the pattern in core Java libraries:
 *     javax.servlet.Filter#doFilter()
 *     java.util.logging.Logger#log()
 * Identification: The pattern is recognizable by behavioral methods of one group of objects that indirectly call
 * the same methods in other objects, while all the objects follow the common interface.
 */
public class Demo {
    public static void main(String[] args) {

    }
}
