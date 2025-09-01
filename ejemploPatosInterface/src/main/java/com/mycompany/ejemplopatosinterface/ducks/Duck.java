package com.mycompany.ejemplopatosinterface.ducks;

import com.mycompany.ejemplopatosinterface.fly.IFlyBehavior;
import com.mycompany.ejemplopatosinterface.quack.IQuackBehavior;

/**
 *
 * @author Estudiantes
 */
public abstract class Duck {
    private IFlyBehavior fly;
    private IQuackBehavior quack;
    
    public Duck(){};
    
    
    public abstract void display();
    
    public void swim(){
        System.out.println("To' los patos flotan");
    }
    
}
