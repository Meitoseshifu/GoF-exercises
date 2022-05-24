package ua.happy.learning.behavioral.a_chain_of_responsibility;

public class EmailNotifier extends Notifier {
    @Override
    public boolean notifySomebody(Priority emergencyLevel) {
        if (emergencyLevel.equals(Priority.IMPORTANT) || emergencyLevel.equals(Priority.ASAP)) {
            System.out.println("Send email: u better read report carefully, it seems we in trouble");
            return notifyNext(emergencyLevel);
        }
        return false;
    }
}
