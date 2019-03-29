package de.lingner.lessons.mosaic.model;

public class Circle extends Stone{
    private Double p = Math.PI;

    @Override
    public Double getSize() {
        return p * Math.pow(getLength(),2);
    }
}
