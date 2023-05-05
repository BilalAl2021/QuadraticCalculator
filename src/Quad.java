public class Quad {
    // variables for the coefficients of the quadratic equation.
    private double a;
    private double b;
    private double c;


    //  A Constructor that takes the coefficients of the quadratic equation and initializes them
    public Quad(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // This Method solves the quadratic equation and returns the roots.
    public CompPair solve() {
        // Calculate the discriminant of the quadratic equation.
        double discriminant = b * b - 4 * a * c;

        // The roots of the equation are complex numbers, if the discriminant is negative.
        if (discriminant < 0) {
            // Calculations for the real and imaginary parts of the complex roots.
            double real = -b / (2 * a);
            double imag = Math.sqrt(-discriminant) / (2 * a);

            // returns a pair of complex numbers which represents the roots of the equation.
            return new CompPair(new Comp(real, imag), new Comp(real, -imag));
        }
        // if the discriminant is non-negative, then the roots of the equation are real numbers.
        else {
            // Calculations of  the real roots of the equation.
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // returns a pair of complex numbers which represents the roots of the equation.
            return new CompPair(new Comp(root1, 0), new Comp(root2, 0));
        }
    }
}

