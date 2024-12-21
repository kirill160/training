package basics.extendses.optionb.task1.abstractflower;

public enum TypeFlower {
    CHAMOMILE,
    ROSA,
    CORNFLOWER;


    private int days;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "TypeFlower{" +
                "days=" + days +
                '}';
    }
}
