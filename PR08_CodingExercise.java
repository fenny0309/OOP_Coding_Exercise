/*
Aim:
Create a Point class representing a 2D point (x, y). Implement a default constructor that initializes
both x and y to 5. Provide a parameterized constructor to initialize x and y with user-supplied
values. Also, implement a copy constructor to create a new Point object as a copy of an existing
Point object. Include a display() method to show the point's coordinates and write a main method
to test all constructors and the display functionality.
*/

import java.util.Scanner;

class Point {
    int x, y;

   
    Point() {
        x = 5;
        y = 5;
    }

   
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

  
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class PR08_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();

        System.out.print("\nEnter x and y values: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Point p2 = new Point(x, y);
        System.out.println("Parameterized Constructor:");
        p2.display();

       
        Point p3 = new Point(p2);
        System.out.println("\nCopy Constructor:");
        p3.display();

        sc.close();
    }
}

/*
Output:
Default Constructor:
Point coordinates: (5, 5)

Enter x and y values: 8 12
Parameterized Constructor:
Point coordinates: (8, 12)

Copy Constructor:
Point coordinates: (8, 12)
*/