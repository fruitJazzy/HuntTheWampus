package view;

import controller.GameController;

import java.io.PrintStream;

/**
 * Created by Tpaktop on 11/5/2016.
 */
public class ConsoleView implements IView {

    private final char EMPTY_ROOM = ' ';
    private final char NOT_EMPTY_ROOM = '*';

    private GameController game;
    private PrintStream out;

    public ConsoleView(final GameController game) {
        assert game != null;
        this.game = game;
        out = System.out;
    }

    @Override
    public void showName() {

    }

    @Override
    public void showCoodrinate(final int x, final int y) {
        if (game.getPlace().getPlace()[y][x] == 0)
            out.print(EMPTY_ROOM);
        else
            out.print(NOT_EMPTY_ROOM);
    }

    private void showLine(final int y) {
        for (int i=0; i<game.getPlace().getSize(); i++) {
            showCoodrinate(i, y);
        }
    }

    @Override
    public void showWinner() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showMap() {
        for (int i = 0; i < game.getPlace().getSize(); i++) {
            showLine(i);
            out.println();
        }
    }

    @Override
    public GameController getGameController() {
        return null;
    }
}
