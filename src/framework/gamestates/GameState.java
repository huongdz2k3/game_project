package framework.gamestates;

import java.awt.*;

public abstract class GameState {
    protected GameStateManager gameStateManager;
    protected GameState(GameStateManager gameStateManager){this.gameStateManager = gameStateManager;}
    protected abstract void loop();

    protected abstract void render(Graphics graphics);

    protected abstract void keyPressed(int keyCode);

    protected abstract void keyReleased(int keyCode);
}
