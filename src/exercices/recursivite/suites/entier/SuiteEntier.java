/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.recursivite.suites.entier;

import exercices.core.Application;
import exercices.recursivite.suites.interfaces.RecursiviteInterface;

/**
 *
 * @author marvin
 */
public class SuiteEntier extends Application implements RecursiviteInterface
{

    @Override
    public void start() {
        suite(0);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    int maxIterations = 300; 
    @Override
    public int suite(int n) {
        maxIterations--;
        
        System.out.println(n);
        if(maxIterations > 0){
            suite(n + 1);
        }
        return 0;
    }
    
}
