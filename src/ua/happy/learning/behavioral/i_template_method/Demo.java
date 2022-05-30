package ua.happy.learning.behavioral.i_template_method;

import java.io.IOException;

/**
 * Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
 * but lets subclasses override specific steps of the algorithm without changing its structure.
 *
 * Real world examples:
 * - All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
 * - All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
 * - javax.servlet.http.HttpServlet, all the doXXX() methods by default send a HTTP 405 “Method Not Allowed” error
 *   as a response. You’re free to override any of them.
 */
public class Demo {
    public static void main(String[] args) throws IOException {

    }
}
