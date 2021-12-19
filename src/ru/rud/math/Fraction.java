package ru.rud.math;

public final class Fraction extends Number {
    private int num;
    private int denom;

    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
        checkFraction();
    }

    public void checkFraction() {
        if (num != 0 && denom == 0)
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        if (denom < 0) {
            denom *= -1;
            num *= -1;
        }
    }

    public Fraction sum(Fraction f) {
        Fraction result;
        if (denom != f.denom) {
            result = new Fraction(num * f.denom + f.num * denom, denom * f.denom);
            return result;
        }
        return result = new Fraction(num + f.num, denom);
    }

    public Fraction sum(int x) {
        Fraction result = new Fraction(num + x * denom, denom);
        return result;
    }

    public Fraction minus(Fraction f) {
        Fraction result;
        if (denom != f.denom) {
            result = new Fraction(num * f.denom - f.num * denom, denom * f.denom);
            return result;
        }
        return result = new Fraction(num - f.num, denom);
    }

    public Fraction minus(int x) {
        Fraction result = new Fraction(num - x * denom, denom);
        return result;
    }

    public Fraction mult(Fraction f) {
        return new Fraction(num * f.num, denom * f.denom);
    }

    public Fraction mult(int x) {
        return new Fraction(num * x, denom);
    }

    public Fraction div(Fraction f) {
        return new Fraction(num * f.denom, denom * f.num);
    }

    public Fraction div(int x) {
        if (x == 0) return new Fraction(0, 0);
        return new Fraction(num, denom * x);
    }

    @Override
    public String toString() {
        if (num == 0) return "0";
        return num + "/" + denom;
    }

    @Override
    public int intValue() {
        return num / denom;
    }

    @Override
    public long longValue() {
        return (long) num / denom;
    }

    @Override
    public float floatValue() {
        return (float) num / denom;
    }

    @Override
    public double doubleValue() {
        return (double) num / denom;
    }

    public int hashCode() {
        return this.num + this.denom;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Fraction f = (Fraction) obj;
        if ((this.denom != f.denom) && this.num != f.num)
            return false;
        return true;
    }
    @Override
    public Fraction clone() {
        return new Fraction(num, denom);
    }
}