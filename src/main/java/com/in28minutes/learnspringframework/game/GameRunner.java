package com.in28minutes.learnspringframework.game;

public class GameRunner {
    // ibe.pl

    public GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game is running: " + game.getClass().getSimpleName());
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
