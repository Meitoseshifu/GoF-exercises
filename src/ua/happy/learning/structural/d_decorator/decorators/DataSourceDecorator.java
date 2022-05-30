package ua.happy.learning.structural.d_decorator.decorators;

public class DataSourceDecorator implements DataSource {

    private DataSource wrapper;

    public DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        return null;
    }
}
