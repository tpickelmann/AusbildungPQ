package de.lingner.lessons.mosaic.model;

public abstract class Stone {
    private Double length;
    private String color;

    public Double getLength() {
        return length;
    }
    public void setLength(Double length) {
        this.length = length;
    }
    public String getColor() {
        return color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public abstract Double getSize();
}
