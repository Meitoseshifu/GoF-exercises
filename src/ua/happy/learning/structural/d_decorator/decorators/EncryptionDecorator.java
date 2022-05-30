package ua.happy.learning.structural.d_decorator.decorators;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrapper) {
        super(wrapper);
    }

    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        return null;
    }

    private String encode(String data) {
        return null;
    }

    private String decode(String data) {
        return null;
    }
}
