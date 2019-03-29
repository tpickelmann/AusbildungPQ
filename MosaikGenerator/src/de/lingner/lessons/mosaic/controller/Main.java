package de.lingner.lessons.mosaic.controller;

import de.lingner.lessons.mosaic.model.*;
import de.lingner.lessons.mosaic.model.Rectangle;

public class Main {
    public static void main(String args[]) {
        MosaicController mc = new MosaicController();
        mc.addAmountOfStones(50);
        Mosaic m = mc.getMosaic();
        System.out.println(m.getStones().size());
        MosaicController mc2 = new MosaicController();
        mc2.addAmountOfStones(17);
        System.out.println(mc2.getMosaic().getStones().get(16).getSize());
        MosaicController mc3 = new MosaicController();
        mc3.addAmountOfStones(30);
        System.out.println(mc3.getMosaic().getStones().get(15).getColor());
        System.out.println("-----");
        MosaicController mc4 = new MosaicController();
        mc4.addAmountOfStones(100);
        Mosaic n = mc4.getMosaic();
        int amount = n.getStones().size();
        String[] shapes = new String[]{"Circle", "Rectangle", "Square", "Triangle"};
        Integer amountOfRectangle = 0;
        Integer amountOfTriangle = 0;
        Integer amountOfCircle = 0;
        Integer amountOfSquare = 0;
        Double sizeOfMosaic = 0.0;
        Integer amountOfBlue = 0;
        Integer amountOfRed = 0;
        Integer amountOfYellow = 0;
        Integer amountOfGreen = 0;

        for (int i = 0; i < amount; i++) {
            Stone stone = n.getStones().get(i);
            if (stone instanceof Rectangle) {
                System.out.println(shapes [1]);
                amountOfRectangle++;
            }
            else if (stone instanceof Triangle) {
                System.out.println(shapes [3]);
                amountOfTriangle++;
            }
            else if (stone instanceof Circle) {
                System.out.println(shapes [0]);
                amountOfCircle++;
            }
            else if (stone instanceof Square) {
                System.out.println(shapes [2]);
                amountOfSquare++;
            }
            System.out.println("Länge des Steins: " + stone.getLength());
            System.out.println("Farbe des Steins: " + stone.getColor());
            System.out.println("Fläche des Steins: " + stone.getSize());
            sizeOfMosaic = sizeOfMosaic + stone.getSize();

            if (stone.getColor().equals("green")) {
                amountOfGreen++;
            }
            else if (stone.getColor().equals("blue")) {
                amountOfBlue++;
            }
            else if (stone.getColor().equals("red")) {
                amountOfRed++;
            }
            else if (stone.getColor().equals("yellow")) {
                amountOfYellow++;
            }
        }
        System.out.println("Anzahl der Dreiecke im 4. Mosaik: " + amountOfTriangle );
        System.out.println("Anzahl der Rechtecke im 4. Mosaik: " + amountOfRectangle );
        System.out.println("Anzahl der Kreise im 4. Mosaik: " + amountOfCircle );
        System.out.println("Anzahl der Quadrate im 4. Mosaik: " + amountOfSquare );
        System.out.println("Gesamtfläche des Mosaik: " + sizeOfMosaic);
        System.out.println("Anzahl der Blauen Steine: " + amountOfBlue);
        System.out.println("Anzahl der Roten Steine: " + amountOfRed);
        System.out.println("Anzahl der Gelben Steine: " + amountOfYellow);
        System.out.println("Anzahl der Grünen Steine: " + amountOfGreen);
    }
}