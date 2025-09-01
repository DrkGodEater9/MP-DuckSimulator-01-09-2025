package com.mycompany.ejemplopatosinterface.ducks;

import com.mycompany.ejemplopatosinterface.fly.IFlyBehavior;
import com.mycompany.ejemplopatosinterface.fly.NoFly;
import com.mycompany.ejemplopatosinterface.quack.IQuackBehavior;
import com.mycompany.ejemplopatosinterface.quack.NoQuack;


/**
 *
 * @author Estudiantes
 */
public class DecoyDuck extends Duck{

    private IFlyBehavior fly = new NoFly();
    private IQuackBehavior quack = new NoQuack();
    @Override
    public void display() {
        System.out.println("Soy un pato decoy");
    }
    
    public void performFly(){
        fly.fly();
    }
    
    public void performQuack(){
        quack.quack();
    }
    
}
