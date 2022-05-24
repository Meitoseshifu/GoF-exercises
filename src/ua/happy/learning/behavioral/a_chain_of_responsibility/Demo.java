package ua.happy.learning.behavioral.a_chain_of_responsibility;

public class Demo {
    public static void main(String[] args) {
        Notifier notifier = new BaseNotifier();
        notifier.linkWith(new EmailNotifier())
                .linkWith(new SmsNotifier());
        notifier.notifySomebody(Priority.ASAP);
    }
}
