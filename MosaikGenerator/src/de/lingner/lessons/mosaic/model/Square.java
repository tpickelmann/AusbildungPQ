package de.lingner.lessons.mosaic.model;

public class Square extends Stone{
    @Override 
    public Double getSize() {
        return this.getLength() * this.getLength();
    }
}
