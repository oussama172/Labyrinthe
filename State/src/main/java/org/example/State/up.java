package org.example.State;



import org.example.core.lookup.Lookup;
import org.example.observer.subject;
import org.example.stateInterface.stateInterface;

public class up implements stateInterface {
    State context;
    public up(State newState) {
        context = newState;
    }

    @Override
    public void youlooser() {
        context.setState(context.getlooser());
        System.out.println(" you losse ");
    }

    @Override
    public void goUp() {
        System.out.println(" you are alrredy  up ");

    }

    @Override
    public void goDown() {
        System.out.println("chemin impossible ");

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
