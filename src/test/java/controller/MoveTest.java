package controller;

import model.Monstr;
import model.Place;
import model.Player;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by Tpaktop on 11/5/2016.
 */
public class MoveTest {

    private Player player;
    private Monstr monstr;
    private Place place;
    private GameController game;
    private int[][] map;

    @BeforeClass
    public void init() {
        String namePlayer = "Van Helsing";
        String nameMostr = "Dracula";

//        map = new int[][] {
//                {1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1},
//                {1, 1, 0, 0, 1},
//                {1, 0, 1, 0, 1},
//                {1, 1, 0, 1, 1}
//        };
        map = new int[][] {
                {1, 1, 1, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0},
                {1, 0, 0, 0, 0},
        };
        player = new Player(namePlayer);
        monstr = new Monstr(nameMostr);
        place = new Place(map);
        game = new GameController(player, monstr, place);
    }

    @Test
    public void testMoveEast() {
        game.setCoordinatePlayer(1,1);
        game.goEast();

        assert player.getCoordinateX() == 2;
        assert player.getCoordinateY() == 1;
    }


    @Test
    public void testMoveWest() {
        game.setCoordinatePlayer(1, 1);
        game.goWest();

        assert player.getCoordinateX() == 0;
        assert player.getCoordinateY() == 1;
    }
    @Test
    public void testMoveNorth() {
        game.setCoordinatePlayer(1,1);
        game.goNorth();

        assert player.getCoordinateX() == 1;
        assert player.getCoordinateY() == 0;
    }
    @Test
    public void testMoveSouth() {
        game.setCoordinatePlayer(1,1);
        game.goSouth();

        assert player.getCoordinateX() == 1;
        assert player.getCoordinateY() == 2;
    }

    @Test
    public void testMoveIntoTheWallToSouth() {
        game.setCoordinatePlayer(3, 2);
        game.goSouth();

        assert player.getCoordinateX() == 2;
        assert player.getCoordinateY() == 3;
    }

    @Test
    public void testMoveIntoTheWallToNorth() {
        game.setCoordinatePlayer(3, 2);
        game.goNorth();

        assert player.getCoordinateX() == 2;
        assert player.getCoordinateY() == 3;
    }
    @Test
    public void testMoveIntoTheWallToWest() {
        game.setCoordinatePlayer(3, 2);
        game.goWest();

        assert player.getCoordinateX() == 2;
        assert player.getCoordinateY() == 3;
    }
    @Test
    public void testMoveIntoTheWallToEast() {
        game.setCoordinatePlayer(3, 2);
        game.goEast();

        assert player.getCoordinateX() == 2;
        assert player.getCoordinateY() == 3;
    }

}