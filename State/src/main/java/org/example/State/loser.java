package org.example.State;

import org.example.stateInterface.stateInterface;

public class loser implements stateInterface {
    State context;
    public loser(State newState) {
        context=newState;
    }


    @Override
    public void youlooser() {
        System.out.println("game over");
    }

    @Override
    public void goUp() {
        System.out.println("game over");
    }

    @Override
    public void goDown() {
        System.out.println("game over");
    }

    @Override
    public void goLeft() {
        System.out.println("game over");
    }

    @Override
    public void goRight() {
        System.out.println("game over");
    }
}

