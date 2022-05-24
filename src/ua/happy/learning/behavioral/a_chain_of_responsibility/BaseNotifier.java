package ua.happy.learning.behavioral.a_chain_of_responsibility;

public class BaseNotifier extends Notifier{
    @Override
    public boolean notifySomebody(Priority emergencyLevel) {
        System.out.printf("Create report using logs with emergencyLevel: %s %n", emergencyLevel.name());
        return notifyNext(emergencyLevel);
    }
}
