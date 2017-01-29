/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage;


import exercices.core.Application;
import exercices.heritage.animaux.entities.Animal;
import exercices.heritage.animaux.entities.Tripoteur;
import exercices.heritage.animaux.entities.impl.Chat;
import exercices.heritage.animaux.entities.impl.Chien;
import exercices.heritage.animaux.entities.impl.Guepard;
import exercices.heritage.meubles.entities.Meuble;
import exercices.heritage.meubles.entities.impl.Armoire;

/**
 *
 * @author marvin
 */
public class Heritage extends Application {

    @Override
    public void start() {
        Animal dog = new Chien();
        Animal cat = new Chat();
        Animal guepard = new Guepard();
        Tripoteur loic = new Tripoteur();
        Meuble tab = new Armoire();
        
        loic.tripote(dog);
        dog.emettreSon();
        loic.tripote(cat);
        cat.emettreSon();
        loic.tripote(guepard);
        guepard.emettreSon();
        
        loic.tripote(tab);
        
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
