package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasic {

    public static void main(String[] args) {

        // var marioGame = new MarioGame();
        // var superContraGame = new SuperContraGame();

        var game = new PacmanGame();

        var gameRunner = new GameRunner(game);

        gameRunner.run();

    }

}