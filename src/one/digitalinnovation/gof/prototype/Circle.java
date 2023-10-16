package one.digitalinnovation.gof.prototype;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        setType("Circle");
    }

    @Override
    void draw() {
        System.out.println("Inside Circle.");
    }

    @Override
	public
    Double getArea() {
        return Math.PI * radius * radius;
    }
}
