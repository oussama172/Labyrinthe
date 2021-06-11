package org.example.State;

import org.example.core.lookup.Lookup;
import org.example.observer.subject;
import org.example.stateInterface.stateInterface;

public class right implements stateInterface {
    State context;

    public right(State newState) { context = newState; }


    @Override
    public void youlooser() {  context.setState(context.getlooser());
        System.out.println(" you losse ");
    }

    @Override
    public void goUp() {
        Lookup.getInstance().getService(subject.class).setState(1);
        context.setState(context.getUp());

    }

    @Override
    public void goDown() {
        Lookup.getInstance().getService(subject.class).setState(2);
        context.setState(context.getDown());


    }

    @Override
    public void goLeft() {
        context.setState(context.getLeft());
        System.out.println("chemin ipossible ");

    }

    @Override
    public void goRight() {
        context.setState(context.getRight());
        System.out.println("you are alrredy right ");

    }
}
