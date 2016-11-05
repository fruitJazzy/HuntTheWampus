package view;

import controller.GameController;
import model.Monstr;
import model.Place;
import model.Player;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Tpaktop on 11/5/2016.
 */
public class ConsoleViewTest {

    ConsoleView view;
    GameController game;

    @BeforeClass
    public void init() {
        game = new GameController(new Player("Max"), new Monstr("Bax"),
                new Place(new int[][] {
                        {1, 1, 1},
                        {1, 1, 0},
                        {0, 0, 1}
                }));
        view = new ConsoleView(game);
    }

    @Test
    public void testShowMap() {
        view.showMap();
    }
}