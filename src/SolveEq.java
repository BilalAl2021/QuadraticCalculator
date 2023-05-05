import java.util.Scanner;

public class SolveEq {
    public static void main(String[] args) {
        //Scanner Object named scanner for reading input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the coefficients of the quadratic equation.
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Create an Object of the Quad class using the coefficients.
        Quad quad = new Quad(a, b, c);

        // Solve the quadratic equation and obtain the roots of the equation.
        CompPair roots = quad.solve();

        // Print the roots of the equation.
        printRoots(roots);
        //Prints the roots type (double real root, distinct real root, distinct complex roots.)
        printRootType(roots);
    }

    // Method that takes a pair of complex numbers and prints them to the output in a readable format.
    private static void printRoots(CompPair roots) {
        // Print the first root.
        System.out.print("Root 1: ");
        if (roots.getFirst().isReal()) {
            // If the root is real, print only the real part.
            System.out.println(roots.getFirst().getReal());
        } else {

            // If the imaginary part is non-zero it prints the real and imaginary parts.(for complex roots)
            if (roots.getFirst().getImag() != 0) {
                System.out.println(roots.getFirst().getReal() + " + " + roots.getFirst().getImag() + "i");
            } else {//else it prints the real part.
                System.out.println(roots.getFirst().getReal());
            }
        }

        // Print the second root.
        System.out.print("Root 2: ");
        if (roots.getSecond().isReal()) {
            // If the root is real, print only the real part.
            System.out.println(roots.getSecond().getReal());
        } else {
            // If the imaginary part is non-zero it prints the real and imaginary parts.(for complex roots)
            if (roots.getSecond().getImag() != 0) {
                System.out.println(roots.getSecond().getReal() + " + " + roots.getSecond().getImag() + "i");
            } else {//else it prints the real part.
                System.out.println(roots.getSecond().getReal());
            }
        }
    }
    // Method that takes a pair of complex numbers and prints their type
    private static void printRootType(CompPair roots) {
        //checks if both roots are equal.
        if (roots.getFirst().isReal() == roots.getSecond().isReal()&&roots.getFirst().getImag()==roots.getSecond().getImag()) {
            // If the two roots are equal, the quadratic equation has a double real root.
            if (roots.getFirst().isReal()==roots.getSecond().isReal()) {
                // If the two roots are equal and are both real numbers, print a corresponding comment.
                System.out.println("The quadratic equation has a double real root.");
            } else {
                // If the two roots are equal but are complex numbers, print a corresponding comment.
                System.out.println("The quadratic equation has a double complex root.");
            }
        } else {
            //Otherwise the roots are distinct
            if (roots.getFirst().isReal() != roots.getSecond().isReal()) {
                // If the two roots are distinct and are both real numbers.
                System.out.println("The quadratic equation has distinct real roots.");
            } else {
                // If at least one of the two roots is a complex number.
                System.out.println("The quadratic equation has distinct complex roots.");
            }
        }
    }



}