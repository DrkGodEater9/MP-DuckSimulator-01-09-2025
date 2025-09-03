package com.mycompany.ejemplopatosinterface.fly;

/**
 *
 * @author Estudiantes
 */
public class NoFly implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("No fly..."); 
    }
    
}
