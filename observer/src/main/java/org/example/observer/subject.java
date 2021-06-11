package org.example.observer;

import java.util.LinkedList;
import java.util.List;

public class subject {

    int state;
    List<subjectInterface> listeners = new LinkedList<>();
    public int getStaete()
    {
        return this.state;
    }
    public void setState(int newState){
        this.state=newState;
        notifyAllObserver();}

    private void notifyAllObserver() {
        for(subjectInterface e : listeners)
            e.update();
        // System.err.println("nombre of observer 1 1 ");

    }
    public void subscribe(subjectInterface newObserver){
        this.listeners.add(newObserver);
    }
    public void unsubscribe(subjectInterface newObserver){
        this.listeners.remove(newObserver);
    }



}

