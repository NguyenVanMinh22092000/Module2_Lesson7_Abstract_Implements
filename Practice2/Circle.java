package Practice2;

public class Circle {
    public String  color;
    public double radius;
    public boolean filled;

    public Circle(String color, double radius, boolean filled) {
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", filled=" + filled +
                '}';
    }
}
