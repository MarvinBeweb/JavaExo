package exercices;

import exercices.core.Application;
import exercices.heritage.Heritage;
import exercices.recursivite.suites.entier.SuiteEntier;
import exercices.recursivite.suites.fibonacci.SuiteFibo;

/**
 *
 * @author marvin
 */
public class Exercices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application exoHeritage = new Heritage();
        SuiteEntier exoSuiteEntier = new SuiteEntier();
        SuiteFibo exoSuiteFibo = new SuiteFibo();
//        exoHeritage.start();
//        exoSuiteEntier.start();
        exoSuiteFibo.start();
    }
    
}