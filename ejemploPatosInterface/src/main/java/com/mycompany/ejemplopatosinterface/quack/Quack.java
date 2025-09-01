package com.mycompany.ejemplopatosinterface.quack;

/**
 *
 * @author Estudiantes
 */
public class Quack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }

    
}
