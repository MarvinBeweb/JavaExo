/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.recursivite.suites.fibonacci;

import exercices.core.Application;
import exercices.recursivite.suites.interfaces.RecursiviteInterface;

/**
 *
 * @author marvin
 */
public class SuiteFibo extends Application implements RecursiviteInterface{

    @Override
    public void start() {
        suite(1);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int maxIterations = 30;
    public int prc = 0;
    @Override
    public int suite(int n){
        maxIterations--;
        System.out.println(prc);
        
        if(maxIterations > 0){
            int tmp = n + prc;
        prc = n;
            suite(tmp);
        }
        return 0;
    }
}
