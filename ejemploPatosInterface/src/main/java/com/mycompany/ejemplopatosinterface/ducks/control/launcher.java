/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplopatosinterface.ducks.control;

import com.mycompany.ejemplopatosinterface.ducks.DecoyDuck;
import com.mycompany.ejemplopatosinterface.ducks.Duck;
import com.mycompany.ejemplopatosinterface.ducks.MallardDuck;
import com.mycompany.ejemplopatosinterface.ducks.RubberDuck;
import com.mycompany.ejemplopatosinterface.fly.FlyWithRocket;
import com.mycompany.ejemplopatosinterface.fly.IFlyBehavior;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Duck mallard = new MallardDuck();
        System.out.println("MallardDuck");
        ((MallardDuck) mallard).performFly();
        ((MallardDuck) mallard).performQuack();

        System.out.println("");
        System.out.println("---Next Duck ");
        System.out.println("");

        Duck rubber = new RubberDuck();
        System.out.println("RubberDuck");
        ((RubberDuck) rubber).performFly();
        ((RubberDuck) rubber).performQuack();

        System.out.println("");
        System.out.println("---Next Duck ");
        System.out.println("");

        Duck decoy = new DecoyDuck();
        System.out.println("DecoyDuck");
        ((DecoyDuck) decoy).performFly();
        ((DecoyDuck) decoy).performQuack();

        System.out.println("");
        System.out.println("---Want to Change the behavior?");
        System.out.println("--- (1) yes");
        System.out.println("--- (2) no");
        System.out.println("--- Write a number");
        System.out.println("");
        int opc;

        do {
            opc = Integer.parseInt(sc.nextLine());
        } while (!(opc == 1 || opc == 2));

        if (opc == 1) {
            System.out.println("");
            IFlyBehavior fly = new FlyWithRocket();
            ((DecoyDuck) decoy).setFly(fly);
            ((DecoyDuck) decoy).performFly();
        } else if (opc == 2) {
        
        }

    }

}
