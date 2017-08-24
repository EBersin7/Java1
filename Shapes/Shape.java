package shapechecker;

import static java.lang.Math.PI;

public class Shape {

//    public enum ShapeType {
//
//        RECTANGLE, TRIANGLE, CIRCLE;
//    }

    private ShapeType type;
    private double base;
    private double height;
    private double diameter;

    public ShapeType getType() {
        return type;
    }

    public void setType(ShapeType type) {
        this.type = type;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (type.equals(ShapeType.RECTANGLE) || (type.equals(ShapeType.TRIANGLE))) {
            this.base = base;
        } else {
            System.out.println("Error: This is not a rectangle or a triangle");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (type.equals(ShapeType.RECTANGLE) || (type.equals(ShapeType.TRIANGLE))) {
            this.height = height;
        } else {
            System.out.println("Error: This is not a rectangle or a triangle");
        }
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (type.equals(ShapeType.CIRCLE)) {
            this.diameter = diameter;
        } else {
            System.out.println("Error: This is not a circle");
        }
    }

    public double getArea() {
        double area = 0;

        if (type.equals(ShapeType.RECTANGLE)) {
            area = base * height;
        } else if (type.equals(ShapeType.TRIANGLE)) {
            area = base * height * 0.5;
        } else {
            area = PI * (0.5 * diameter) * (0.5 * diameter);
        }
        return area;
    }

    public boolean equals(Shape otherShape) {
        return Math.abs(getArea() - otherShape.getArea()) <= 50;
    }
}
