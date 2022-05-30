package ua.happy.learning.behavioral.h_strategy;

import ua.happy.learning.behavioral.h_strategy.strategies.Order;
import ua.happy.learning.behavioral.h_strategy.strategies.PayByCreditCard;
import ua.happy.learning.behavioral.h_strategy.strategies.PayByPaypal;
import ua.happy.learning.behavioral.h_strategy.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them
 * into a separate class, and make their objects interchangeable.
 *
 * Examples from real world:
 *  - java.util.Comparator#compare() called from Collections#sort().
 *  - javax.servlet.http.HttpServlet: service() method, plus all of the doXXX() methods that accept HttpServletRequest
 *    and HttpServletResponse objects as arguments.
 *  - javax.servlet.Filter#doFilter()
 */
public class Demo {
    private static final Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.println("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.println("Do you wish to continue selecting products?");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String payentMethod = reader.readLine();

                // Client creates different strategies based on input from
                // user, application configuration, etc.
                strategy = payentMethod.equals("1") ? new PayByPaypal() : new PayByCreditCard();
            }

            // Order object delegates gathering payment data to strategy
            // object, since only strategies know what data they need to
            // process a payment.
            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                //Finally, strategy handles the payment
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }

        }


    }
}
