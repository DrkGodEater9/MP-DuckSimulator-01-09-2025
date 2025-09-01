package com.mycompany.ejemplopatosinterface.ducks;

import com.mycompany.ejemplopatosinterface.fly.FlyWithWings;
import com.mycompany.ejemplopatosinterface.fly.IFlyBehavior;
import com.mycompany.ejemplopatosinterface.quack.IQuackBehavior;
import com.mycompany.ejemplopatosinterface.quack.Quack;

/**
 *
 * @author Estudiantes
 */
public class RedHeadDuck extends Duck{

    private IFlyBehavior fly = new FlyWithWings();
    private IQuackBehavior quack = new Quack();
    @Override
    public void display() {
        System.out.println("Pato cabeza roja");
    }
    
    public void performFly(){
        fly.fly();
    }
    
    public void performQuack(){
        quack.quack();
    }
}
