class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();

            default:
                throw new IllegalArgumentException("Tipo di forma non supportato: " + shapeType);
        }
    }
}