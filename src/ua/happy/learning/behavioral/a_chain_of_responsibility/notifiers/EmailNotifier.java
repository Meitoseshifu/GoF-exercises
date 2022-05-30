package ua.happy.learning.behavioral.a_chain_of_responsibility.notifiers;

public class EmailNotifier extends Notifier {

    @Override
    public boolean notifySomebody(Priority emergencyLevel) {
        return false;
    }
}
