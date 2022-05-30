package ua.happy.learning.structural.g_proxy;

/**
 * Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
 * A proxy controls access to the original object, allowing you to perform something either before or after the
 * request gets through to the original object.
 *
 * Some examples of proxies in standard Java libraries:
 *     java.lang.reflect.Proxy
 *     java.rmi.*
 *     javax.ejb.EJB (see comments)
 *     javax.inject.Inject (see comments)
 *     javax.persistence.PersistenceContext
 * Identification: Proxies delegate all of the real work to some other object. Each proxy method should, in the end,
 * refer to a service object unless the proxy is a subclass of a service.
 */
public class Demo {
    public static void main(String[] args) {

    }

}
