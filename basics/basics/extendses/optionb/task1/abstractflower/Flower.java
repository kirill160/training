package basics.extendses.optionb.task1.abstractflower;


import java.util.Objects;

public abstract class Flower implements Comparable<Flower> {
    protected TypeFlower typeFlower;
    protected int price;
    protected String nameFlower;
    protected int lengthStem;

    public Flower(TypeFlower typeFlower, int price, String nameFlower, int lengthStem) {
        this.typeFlower = typeFlower;
        this.price = price;
        this.nameFlower = nameFlower;
        this.lengthStem = lengthStem;
    }


    public TypeFlower getTypeFlower() {
        return typeFlower;
    }

    public void setTypeFlower(TypeFlower typeFlower) {
        this.typeFlower = typeFlower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLengthStem() {
        return lengthStem;
    }

    public void setLengthStem(int lengthStem) {
        this.lengthStem = lengthStem;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }


    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Flower o) {
        return Integer.compare(this.typeFlower.getDays(), o.typeFlower.getDays());

    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Flower)) return false;
        Flower flower = (Flower) object;
        return getPrice() == flower.getPrice() && getLengthStem() == flower.getLengthStem() && getTypeFlower() == flower.getTypeFlower() && Objects.equals(getNameFlower(), flower.getNameFlower());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeFlower(), getPrice(), getNameFlower(), getLengthStem());
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Flower{" +
                "typeFlower=" + typeFlower +
                ", price=" + price +
                ", nameFlower='" + nameFlower + '\'' +
                ", lengthStem=" + lengthStem +
                '}';
    }
}
