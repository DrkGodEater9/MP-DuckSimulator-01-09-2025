/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplopatosinterface.ducks.control;

import com.mycompany.ejemplopatosinterface.ducks.Duck;
import com.mycompany.ejemplopatosinterface.ducks.MallardDuck;

/**
 *
 * @author Estudiantes
 */
public class launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        ((MallardDuck)mallard).performFly();
        ((MallardDuck)mallard).performQuack();
    }
    
}
