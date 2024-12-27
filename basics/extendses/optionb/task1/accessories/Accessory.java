package basics.extendses.optionb.task1.accessories;


import java.util.Objects;

public class Accessory {
    private String name;
    private int price;

    public Accessory(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Accessory)) return false;
        Accessory accessory = (Accessory) object;
        return getPrice() == accessory.getPrice() && Objects.equals(getName(), accessory.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
