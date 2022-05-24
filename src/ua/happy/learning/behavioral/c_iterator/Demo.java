package ua.happy.learning.behavioral.c_iterator;

public class Demo {
    public static void main(String[] args) {
        String [] skills = new String[] {"Java", "Maven", "Spring", "Hibernate", "PostgreSQL"};
        JavaDeveloper developer = new JavaDeveloper("Some Dude", skills);

        Iterator iterator = developer.getIterator();
        System.out.println("Name: " + developer.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}
