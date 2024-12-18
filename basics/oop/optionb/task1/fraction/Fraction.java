package basics.oop.optionb.task1.fraction;

public class Fraction {
    private int m;
    private int n;
    private static final int ZERO = 0;

    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public Fraction() {

    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Fraction additionsFractions(Fraction other) {
        Fraction result = null;
        notNull(other);

        throwExceptionUnderTheCondition(other);

        int resultM;
        if (this.n == other.n) {
            resultM = this.m + other.m;
            result = new Fraction(resultM, this.n);
        }else {
            int resultN = this.n * other.n;
            resultM = (resultN / this.n * this.m) + (resultN / other.n * other.m);
            result = new Fraction(resultM, resultN);
        }

        return result;
    }

    public Fraction subtractionFractions(Fraction other) {
        Fraction result;
       notNull(other);

        throwExceptionUnderTheCondition(other);

        int resultM = 0;
        if (this.n == other.n) {
            resultM = this.m - other.m;
            result = new Fraction(resultM, this.n);
        }else {
            int resultN = this.n * other.n;
            resultM = (resultN / this.n * this.m) - (resultN / other.n * other.m);
            result = new Fraction(resultM, resultN);
        }
        return result;

    }

    public Fraction divisionFractions(Fraction other) {
        notNull(other);

        throwExceptionUnderTheCondition(other);

        int resultM = this.m * other.n;
        int resultN = this.n * other.m;

        return new Fraction(resultM, resultN);
    }

    public Fraction multiplicationFractions(Fraction other){
         notNull(other);

         int resultM = this.m * other.m;
         int resultN = this.n * other.n;
        return new Fraction(resultM, resultN);
    }

    private void throwExceptionUnderTheCondition(Fraction other) {
        if (this.m == ZERO && this.n == ZERO || other.m == ZERO && other.n == ZERO) {
            throw new IllegalArgumentException("argument is zero");
        }
    }
    private void notNull(Fraction fraction){
        if (fraction == null) {
            fraction = new Fraction();
        }
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }
}
