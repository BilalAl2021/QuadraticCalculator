public class Comp {
    // variables for the real and imaginary parts of the complex number.
    private double real;
    private double imag;

    //  A Constructor that takes the real and imaginary parts of the complex number and initializes them
    public Comp(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // getMethod that returns the real part of the complex number.
    public double getReal() {
        return this.real;
    }

    // getMethod that returns the imaginary part of the complex number.
    public double getImag() {
        return this.imag;
    }

    // This Method determines whether the complex number is real.
    public boolean isReal() {

        return (this.imag == 0);//returns true if the imaginary part of the complex number is zero, and false if it's not equal to zero
    }


}


