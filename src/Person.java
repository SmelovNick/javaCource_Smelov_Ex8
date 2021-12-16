public abstract class Person {
    private int age;
    private String name;
    private Season preferredSeason;

    public Person(int age, String name, Season preferredSeason) {
        this.age = age;
        this.name = name;
        this.preferredSeason = preferredSeason;
    }

    public Season getPreferredSeason() {
        return preferredSeason;
    }

    public void setPreferredSeason(Season preferredSeason) {
        this.preferredSeason = preferredSeason;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
