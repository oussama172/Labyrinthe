package org.example.gui;

import org.example.observer.subject;
import org.example.observer.subjectInterface;

public class observateur extends subjectInterface {
    afficheur afficheur;
    public observateur(subject newPublisher, afficheur monAfficheur)
    {this.publisher=newPublisher;
        this.publisher.subscribe(this);
        afficheur =monAfficheur;

    }
    @Override
    public void update(){
        int etat=this.publisher.getStaete();

        if(etat==1)

            afficheur.update_up();
        if(etat==2)

            afficheur.update_down();
        if(etat==3)
            afficheur.update_left();
        if(etat==4)
            afficheur.update_right();

    }
}

