package ua.happy.learning.structural.d_decorator.decorators;

public class FileDataSource implements DataSource {

    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        return null;
    }
}
