package de.lingner.lessons.mosaic.model;

public class Rectangle extends Stone{
    private Double width;


    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double getSize(){
        return this.getWidth() * this.getLength();
    }
}
