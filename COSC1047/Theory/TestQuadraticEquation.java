package OOP;

// Test program

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for coefficients
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation eq = new QuadraticEquation(a, b, c);

        double discriminant = eq.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("The equation has two roots: "
                + eq.getRoot1() + " and " + eq.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root: "
                + eq.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }

        input.close();
    }
}