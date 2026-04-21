/*
Aim:
Define a Java class named Rectangle with two double data fields: width and height,
both having default value 1. Implement a no-argument constructor and a parameterized
constructor. Include methods getArea() and getPerimeter() to calculate and return
the area and perimeter of the rectangle. Accept width and height dynamically from the user.
*/

import java.util.Scanner;

class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class PR06_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Rectangle r = new Rectangle(w, h);

        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());

        sc.close();
    }
}

/*
Output:
Enter width: 5
Enter height: 3
Area = 15.0
Perimeter = 16.0
*/