package one.digitalinnovation.gof.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle(2);
        circle.draw();
        shapeMap.put("1", circle);

        Square square = new Square(3);
        square.draw();
        shapeMap.put("2", square);
        
        Triangle triangle = new Triangle(3, 5);
        triangle.draw();
        shapeMap.put("3", triangle);
       
    }
}

