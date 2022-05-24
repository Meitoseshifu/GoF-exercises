package ua.happy.learning.structural.d_decorator.madebyme;

public class CasualDress extends DressDecorator {
    public CasualDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Casual Dress Features.");
    }
}
