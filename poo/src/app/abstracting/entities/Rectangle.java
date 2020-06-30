package app.abstracting.entities;

import app.abstracting.entities.enums.*;

/**
 * Rectangle
 */
public class Rectangle extends Shape {

    private Double width;
    private Double height;

    public Rectangle(){}

    public Rectangle(Color color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }
    
    
}