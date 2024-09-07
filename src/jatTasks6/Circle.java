package jatTasks6;

public class Circle {

	// Attribute
    private double radius;

    // No-argument constructor (default radius 1.0)
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with radius as argument
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Create Circle objects using both constructors
        Circle defaultCircle = new Circle();   // No-arg constructor
        Circle customCircle = new Circle(5.0); // Constructor with radius argument

        // Displaying the circumference of both circles
        System.out.println("Default Circle Circumference: " + defaultCircle.getCircumference());
        System.out.println("Custom Circle Circumference: " + customCircle.getCircumference());
    }

}
