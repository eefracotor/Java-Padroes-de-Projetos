package one.digitalinnovation.gof;

import one.digitalinnovation.gof.prototype.Circle;
import one.digitalinnovation.gof.prototype.Shape;
import one.digitalinnovation.gof.prototype.ShapeCache;
import one.digitalinnovation.gof.prototype.Square;
import one.digitalinnovation.gof.prototype.Triangle;

public class Main {

	public static void main(String[] args) {
		
		//Prototype
		
		ShapeCache.loadCache();

		Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape1.getType() + ", Area: " + ((Circle) clonedShape1).getArea());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType() + ", Area: " + ((Square) clonedShape2).getArea());

		Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType() + ", Area: " + ((Triangle) clonedShape3).getArea());
		
	}

}
