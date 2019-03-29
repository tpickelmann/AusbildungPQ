package de.lingner.lessons.mosaic.model;

import java.util.ArrayList;
import java.util.List;

public class Mosaic {
    private List<Stone> stones = new ArrayList<>();

    public List<Stone> getStones() {
        return stones;
    }

    public void setStones(List<Stone> stones) {
        this.stones = stones;
    }

}
