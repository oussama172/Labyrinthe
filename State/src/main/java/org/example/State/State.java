package org.example.State;

import org.example.stateInterface.stateInterface;

public class State implements stateInterface {




    private stateInterface State;
    stateInterface up;
    stateInterface down;
    stateInterface right;
    stateInterface left ;
    stateInterface looser;

    public State(){
        up=new up(this);
        down=new down(this);
        right=new right(this);
        left=new left(this);
        looser=new loser(this);
        State = down;
    }

    public void setState(stateInterface newState) {   State = newState;  }


    @Override
    public void youlooser() {
        State.youlooser();

    }

    @Override
    public void goUp() {
        State.goUp();

    }

    @Override
    public void goDown() {
        State.goDown();

    }

    @Override
    public void goLeft() {
        State.goLeft();

    }

    @Override
    public void goRight() {
        State.goRight();

    }
    public stateInterface getUp(){return up;}
    public stateInterface getDown(){return down;}
    public stateInterface getLeft(){return left;}
    public stateInterface getRight(){return right;}
    public stateInterface getlooser(){return looser;}
}
