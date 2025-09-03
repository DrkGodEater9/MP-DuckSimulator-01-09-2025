package com.mycompany.ejemplopatosinterface.ducks;


import com.mycompany.ejemplopatosinterface.fly.IFlyBehavior;
import com.mycompany.ejemplopatosinterface.fly.NoFly;
import com.mycompany.ejemplopatosinterface.quack.Squeak;
import com.mycompany.ejemplopatosinterface.quack.IQuackBehavior;


/**
 *
 * @author Estudiantes
 */
public class RubberDuck extends Duck{

    private IFlyBehavior fly = new NoFly();
    private IQuackBehavior quack = new Squeak();
    @Override
    public void display() {
        
    }
    
    public void performFly(){
        fly.fly();
    }
    
    public void performQuack(){
        quack.quack();
    }
}
