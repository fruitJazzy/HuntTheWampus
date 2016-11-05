package controller;

import model.Monstr;
import model.Place;
import model.Player;

/**
 * Created by Tpaktop on 11/5/2016.
 */
public class GameController {

    private Player player;
    private Place place;
    private Monstr monstr;

    public GameController(final Player player, final Monstr monstr, final Place place) {
        this.place = place;
        this.player = player;
        this.monstr = monstr;
    }


    public void setCoordinatePlayer(final int y, final int x) {
        player.setCoordinateY(y);
        player.setCoordinateX(x);
    }

    public void goEast() {
        if (!checkCoordinate() &&
                place.getPlace()[player.getCoordinateY()][player.getCoordinateX() + 1] == 1)
            player.goEast();
    }

    public void goWest() {
        if (!checkCoordinate() &&
                place.getPlace()[player.getCoordinateY()][player.getCoordinateX() - 1] == 1)
            player.goWest();
    }

    public void goNorth() {
        if (!checkCoordinate() &&
                place.getPlace()[player.getCoordinateY() - 1][player.getCoordinateX()] == 1)
            player.goNorth();
    }

    public void goSouth() {
        if (!checkCoordinate() &&
                place.getPlace()[player.getCoordinateY() + 1][player.getCoordinateX()] == 1)
            player.goSouth();
    }

    private boolean checkCoordinate() {
        return place.getSize() < player.getCoordinateX() + 1
                || place.getSize() < player.getCoordinateY() + 1
                || player.getCoordinateX() - 1 < 0
                || player.getCoordinateY() - 1 < 0;
    }

    public Place getPlace() {return place;}

}
