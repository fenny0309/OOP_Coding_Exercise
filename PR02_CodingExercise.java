/*
Aim:
Write a Java program to solve a system of two linear equations with two variables
using Cramer's Rule.
*/

import java.util.Scanner;

public class PR02_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - e * c;

        if (D == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
        }

        sc.close();
    }
}

/*
OUTPUT:

1)
Input: 1 2 3 4 5 6
Output:
x = -4.00
y = 4.50

2)
Input: 2 4 1 2 3 6
Output:
x = 0.00
y = 1.50

3)
Input: 1 2 2 4 3 6
Output:
The system has no unique solution.
*/