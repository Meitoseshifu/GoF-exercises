package ua.happy.learning.structural.d_decorator.madebyme;

public class DressDecorator implements Dress {
    protected Dress dress;

    public DressDecorator(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void assemble() {
        this.dress.assemble();
    }
}
