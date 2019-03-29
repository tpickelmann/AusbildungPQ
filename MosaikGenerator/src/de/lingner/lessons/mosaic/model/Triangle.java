package de.lingner.lessons.mosaic.model;

public class Triangle extends Stone{
    private Double height;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    @Override
    public Double getSize() {
        return this.getHeight()* this.getLength() * 0.5;
    }
}
