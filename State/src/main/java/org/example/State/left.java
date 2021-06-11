package org.example.State;

import org.example.core.lookup.Lookup;
import org.example.observer.subject;
import org.example.stateInterface.stateInterface;

public class left implements stateInterface {


    State context;

    subject pub= Lookup.getInstance().getService(subject.class);
    public left(State newState) {  context=newState; }


    @Override
    public void youlooser() {  context.setState(context.getlooser());
        System.out.println(" you losse ");}

    @Override
    public void goUp() {
        pub.setState(1);
        context.setState(context.getUp());

    }

    @Override
    public void goDown() {
        pub.setState(2);
        context.setState(context.getDown());

    }

    @Override
    public void goLeft() {
        context.setState(context.getLeft());
        System.out.println("you are alrredy left ");
    }

    @Override
    public void goRight() {
        context.setState(context.getRight());
        System.out.println(" chemin impossible ");
    }
}
