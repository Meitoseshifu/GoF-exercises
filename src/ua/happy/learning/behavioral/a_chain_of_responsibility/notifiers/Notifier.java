package ua.happy.learning.behavioral.a_chain_of_responsibility.notifiers;

public abstract class Notifier {

    public Notifier linkWith(Notifier next) {
        return null;
    }

    public abstract boolean notifySomebody(Priority emergencyLevel);

    protected boolean notifyNext(Priority emergencyLevel) {
        return false;
    }

}
