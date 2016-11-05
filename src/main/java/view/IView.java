package view;

import controller.GameController;

/**
 * Created by Tpaktop on 11/5/2016.
 */
public interface IView {

    void showName();

    void showCoodrinate(final int x, final int y);

    void showWinner();

    void showMessage(final String message);

    void showMap();

    GameController getGameController();

}
