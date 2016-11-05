package model;

/**
 * Created by Tpaktop on 11/5/2016.
 */
public class Place {

    private static final int SIZE = 5;
    private int[][] place;

    public Place() {
        place = new int[][] {
                {0, 1, 0, 0},
                {0, 1, 1, 1},
                {0, 1, 1, 1},
                {0, 1, 1, 1}
        };

    }

    public Place(final int[][] place) {
        this.place = place;
    }

    public int[][] getPlace() {
        return place;
    }

    public int getSize() {
        return place.length;
    }
}
