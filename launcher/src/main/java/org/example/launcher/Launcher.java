package org.example.launcher;

import org.example.State.State;
import org.example.core.lookup.Lookup;
import org.example.gui.afficheur;
import org.example.gui.gui.configere;
import org.example.gui.observateur;
import org.example.observer.subject;
import org.example.stateInterface.stateInterface;

public class Launcher {

    static {
        // initialisation du Lookup
        // Lookup.getInstance().register(MessagingService.class, new MessagingServiceImpl() );
        Lookup.getInstance().register(subject.class, new subject());
        Lookup.getInstance().register(stateInterface.class, new State());
        Lookup.getInstance().register(afficheur.class, new afficheur());
    }
    public Launcher() {

    }




    public static void main(String[] args) {
        configere config= new configere();

        observateur mysender=new observateur( Lookup.getInstance().getService(subject.class),
                Lookup.getInstance().getService(afficheur.class));


    }



}
