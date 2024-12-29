package basics.extendses.optiona.task2.wheel;


import java.util.Objects;

public class Wheel {
    private  TypeWheel typeWheel;

    public Wheel(TypeWheel typeWheel) {
        this.typeWheel = typeWheel;

    }

    public TypeWheel getTypeWheel() {
        return typeWheel;
    }

    public void setTypeWheel(TypeWheel typeWheel) {
        this.typeWheel = typeWheel;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Wheel)) return false;
        Wheel wheel = (Wheel) object;
        return getTypeWheel() == wheel.getTypeWheel();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getTypeWheel());
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "typeWheel=" + typeWheel +
                '}';
    }
}
