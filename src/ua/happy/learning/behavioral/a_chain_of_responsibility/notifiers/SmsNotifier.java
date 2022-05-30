package ua.happy.learning.behavioral.a_chain_of_responsibility.notifiers;

public class SmsNotifier extends Notifier {

    @Override
    public boolean notifySomebody(Priority emergencyLevel) {
        return false;
    }

    private void orderRedBullAndCoffee() {

    }
}
