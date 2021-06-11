package org.example.State;

import org.example.core.lookup.Lookup;
import org.example.observer.subject;
import org.example.stateInterface.stateInterface;

public class down implements stateInterface {


    State context;
    public down(State newState) {
        context=newState;
    }


    @Override
    public void youlooser() {
        context.setState(context.getlooser());
        System.out.println(" you losse ");
    }

    @Override
    public void goUp() {
        context.setState(context.getUp());
        System.out.println("chemin chemin im ");

    }

    @Override
    public void goDown() {
        context.setState(context.getDown());
        System.out.println("you are alrredy ");

    }

    @Override
    public void goLeft() {
        Lookup.getInstance().getService(subject.class).setState(3);
        context.setState(context.getLeft());


    }

    @Override
    public void goRight() {
        Lookup.getInstance().getService(subject.class).setState(4);
        context.setState(context.getRight());


    }
}

