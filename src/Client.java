public class Client extends Person implements Printable, ClickHandler{
    int clientId;

    public Client(int age, String name, Season preferredSeason, int clientId) {
        super(age, name, preferredSeason);
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public void getInfo() {
        System.out.println("Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "ID: " + getClientId() + "\n" +
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
