package model;

/**
 * Created by Tpaktop on 11/5/2016.
 */
public class Player implements Walkable {

    private final String name;
    private int coordinateX;
    private int coordinateY;

    public Player(final String name) {
        this.name = name;
    }

    public Player(final String name, final int x, final int y) {
        this(name);
        coordinateX = x;
        coordinateY = y;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(final int x) {
        coordinateX = x;
    }

    public void setCoordinateY(final int y) {
        coordinateY = y;
    }

    public String getName() { return name; }

    public void goEast() {
        coordinateX++;
    }

    public void goWest() {
        coordinateX--;
    }

    public void goNorth() {
        coordinateY--;
    }

    public void goSouth() {
        coordinateY++;
    }
}
