public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Interface.Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Interface.Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Interface.Square();
        }
        return null;
    }
}
