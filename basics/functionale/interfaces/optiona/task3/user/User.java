package basics.functionale.interfaces.optiona.task3.user;

public class User {
    private static int count = 0;
    private int id;
    private String name;
    private int yearsOld;
    private String country;

    public User(String name, int yearsOld, String country) {
        this.id = count++;
        this.name = name;
        this.yearsOld = yearsOld;
        this.country = country;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearsOld=" + yearsOld +
                ", country='" + country + '\'' +
                '}';
    }
}
