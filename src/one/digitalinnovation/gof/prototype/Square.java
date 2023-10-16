package one.digitalinnovation.gof.prototype;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
        setType("Square");
    }

    @Override
    void draw() {
        System.out.println("Inside Square.");
    }

    @Override
	public
    Double getArea() {
        return side * side;
    }
}



