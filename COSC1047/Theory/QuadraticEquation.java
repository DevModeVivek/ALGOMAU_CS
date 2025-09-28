package OOP;


class QuadraticEquation {
    // Private data fields
    private double a;
    private double b;
    private double c;

    // Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to calculate discriminant
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    // Methods to calculate roots
    public double getRoot1() {
        double d = getDiscriminant();
        if (d < 0) return 0;
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    public double getRoot2() {
        double d = getDiscriminant();
        if (d < 0) return 0;
        return (-b - Math.sqrt(d)) / (2 * a);
    }
}
