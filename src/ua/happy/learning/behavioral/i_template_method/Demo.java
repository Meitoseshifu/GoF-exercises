package ua.happy.learning.behavioral.i_template_method;

import ua.happy.learning.behavioral.i_template_method.networks.Facebook;
import ua.happy.learning.behavioral.i_template_method.networks.Network;
import ua.happy.learning.behavioral.i_template_method.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password");
        String password = reader.readLine();

        System.out.println("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
