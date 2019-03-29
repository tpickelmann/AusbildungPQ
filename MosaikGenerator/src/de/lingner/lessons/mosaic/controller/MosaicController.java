package de.lingner.lessons.mosaic.controller;

import de.lingner.lessons.mosaic.model.*;

public class MosaicController {
    private String[] colors = new String[]{"red", "green", "blue", "yellow"};
    private Mosaic mosaic = new Mosaic();

    public Mosaic getMosaic() {
        return mosaic;
    }

    public void setMosaic(Mosaic mosaic) {
        this.mosaic = mosaic;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }


    public void addRandomStone() {
        Integer colorIndex = (int) (Math.random() * 3);
        String color = colors[colorIndex];
        int length = (int) (Math.random() * 99 + 1);
        int width = (int) (Math.random() * 99 + 1);
        int height = (int) (Math.random() * 99 + 1);
        Integer stoneIndex = (int) (Math.random() * 3);
//        Stone stone;

        switch (stoneIndex) {
            case 0: {
                Rectangle stone = new Rectangle();
                stone.setColor(color);
                stone.setLength((double) length);
                stone.setWidth((double) width);
                mosaic.getStones().add(stone);
                break;
            }

            case 1: {
                Triangle stone = new Triangle();
                stone.setColor(color);
                stone.setLength((double) length);
                stone.setHeight((double) height);
                mosaic.getStones().add(stone);
                break;
            }

            case 2: {
                Square stone = new Square();
                stone.setColor(color);
                stone.setLength((double) length);
                mosaic.getStones().add(stone);
                break;
            }

            case 3: {
                Circle stone = new Circle();
                stone.setColor(color);
                stone.setLength((double) length);
                mosaic.getStones().add(stone);
                break;
            }

            default: {
                Circle stone = new Circle();
                stone.setColor(color);
                stone.setLength((double) length);
                mosaic.getStones().add(stone);
                break;
            }
        }
    }

    public void addAmountOfStones(Integer amount) {
        for (int i = 0; i < amount ; i++){
            addRandomStone();
        }
    }
}
