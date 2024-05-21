package oops.shape;

public class Shape {
    private String color = null;
    private int borderWidth = 0;
    public Shape() {
        System.out.println("Shape default constructor");
    }
    public Shape(String color, int borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }
    public int getBorderWidth() {
        return borderWidth;
    }
    public String getColor() {
        return color;
    }

}
