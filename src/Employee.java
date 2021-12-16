import java.awt.*;

public class Employee extends Person implements Printable, ClickHandler{
    private int workerId;

    private String department;

    public Employee(int age, String name, Season preferredSeason, int workerId, String department) {
        super(age, name, preferredSeason);
        this.workerId = workerId;
        this.department = department;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getInfo() {
        System.out.println("Name: " + getName() + "\n"+
                "Age: " + getAge() + "\n"+
                "ID: " + getWorkerId() + "\n"+
                "Department: " + getDepartment() + "\n"+
                "Preferred season: " + getPreferredSeason());
    }

    @Override
    public void getSeason() {
        {
             String seasonInfo = getPreferredSeason() +
                    ".[r=" + getPreferredSeason().getColor().getRed() + ", " +
                    "g=" + getPreferredSeason().getColor().getGreen() + ", " +
                    "b=" + getPreferredSeason().getColor().getBlue() + "]";
            System.out.println("Сейчас " + seasonInfo);
        }
    }
}
