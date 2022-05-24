package ua.happy.learning.structural.d_decorator.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
