package one.digitalinnovation.gof.prototype;

public class Triangle extends Shape {
	private final double side;
	private final double height;

    public Triangle(double side, double height) {
        this.side = side;
		this.height = height;
        setType("Triangle");
    }
    @Override
    void draw() {
        System.out.println("Inside Triangle.");
    }

    @Override
	public
    Double getArea() {
        return (side * height)/2;
    }
}
