import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(23, "John", Season.WINTER, 1337);
        client.getInfo();
        client.getSeason();

        System.out.println();

        Employee employee = new Employee(50, "Peter", Season.SPRING, 12, "IT");
        employee.getInfo();
        employee.getSeason();
    }
}
