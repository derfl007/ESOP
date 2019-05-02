package ab04;

public class Aufgabe16 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0, 4.0);
        Rectangle r2 = new Rectangle(10.0, 5.0);
        Rectangle r3 = new Rectangle(3.0, 2.5);

        /* test getter methods */
        System.out.println("**** Test getter methods ****");
        System.out.println("Length of r1: " + r1.getLength());
        System.out.println("Width of r1: " + r1.getWidth());
        System.out.println("Length of r2: " + r2.getLength());
        System.out.println("Width of r2: " + r2.getWidth());
        System.out.println();

        /* test toString method */
        System.out.println("**** Test toString method ****");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println();

        /* test isSquare method */
        System.out.println("**** Test isSquare method ****");
        System.out.println("r1 is " + (r1.isSquare() ? "a " : "no ") + "square.");
        System.out.println("r3 is " + (r3.isSquare() ? "a " : "no ") + "square.");
        System.out.println();

        /* test getArea method */
        System.out.println("**** Test getArea method ****");
        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Area of r3: " + r3.getArea());
        System.out.println();

        /* test getPerimeter method */
        System.out.println("**** Test getPerimeter method ****");
        System.out.println("Perimeter of r2: " + r2.getPerimeter());
        System.out.println("Perimeter of r3: " + r3.getPerimeter());
        System.out.println();

        /* test getDiagonalLength method */
        System.out.println("**** Test getDiagonalLength method ****");
        System.out.println("Diagonal length of r1: " + r1.getDiagonalLength());
        System.out.println("Diagonal length of r2: " + r2.getDiagonalLength());
        System.out.println();

        /* test compareArea method */
        System.out.println("**** Test compareArea method ****");
        int retValue = r1.compareArea(r2);
        if (retValue == 0) {
            System.out.println("The area of r1 and r2 are equal.");
        } else if (retValue < 0) {
            System.out.println("The area of r2 is larger than the area of r1.");
        } else {
            System.out.println("The area of r1 is larger than the area of r2.");
        }
        System.out.println();

        /* test comparePerimeter method */
        System.out.println("**** Test comparePerimeter method ****");
        retValue = r2.comparePerimeter(r3);
        if (retValue == 0) {
            System.out.println("The perimeter of r2 and r3 are equal.");
        } else if (retValue < 0) {
            System.out.println("The perimeter of r3 is longer than the perimeter of r2.");
        } else {
            System.out.println("The perimeter of r2 is longer than the perimeter of r3.");
        }
    }
}

class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    public boolean isSquare() {
        return (width == length);
    }

    public double getDiagonalLength() {
        return Math.sqrt((width * width) + (length * length));
    }

    public int compareArea(Rectangle r) {
        return (Double.compare(this.getArea(), r.getArea()));
    }

    public int comparePerimeter(Rectangle r) {
        return (Double.compare(this.getPerimeter(), r.getPerimeter()));
    }

    public String toString() {
        return "Rectangle [width: " + width + ", length: " + length + "]";
    }
}
