package com.in28minutes.learnspringframework.game;

public class App01GamingBasic {

    public static void main(String[] args) {

        // var marioGame = new MarioGame();
        // var superContraGame = new SuperContraGame();

        var game = new PacmanGame();

        var gameRunner = new GameRunner(game);

        gameRunner.run();

    }

}
