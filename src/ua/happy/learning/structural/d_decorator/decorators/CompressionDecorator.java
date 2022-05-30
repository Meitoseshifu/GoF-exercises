package ua.happy.learning.structural.d_decorator.decorators;

public class CompressionDecorator extends DataSourceDecorator {

    private int compLevel = 6;

    public CompressionDecorator(DataSource wrapper) {
        super(wrapper);
    }

    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        return null;
    }

    private String compress(String stringData) {
        return null;
    }

    private String decompress(String stringData) {
        return null;
    }
}
