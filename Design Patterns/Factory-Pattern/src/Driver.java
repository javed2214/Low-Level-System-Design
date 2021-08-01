// ***** Factory Pattern *****

import com.shape.Shape;
import com.shape.ShapeFactory;

public class Driver {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        // Shape shape4 = shapeFactory.getShape("ZZZ");
        // shape4.draw();       Will throw Error
    }
}
