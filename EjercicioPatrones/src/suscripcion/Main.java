/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suscripcion;

/**
 *
 * @author Antony Artavia
 */
public class Main {
    
    public static void main(String args[]){
        Promocion promocion = new Promocion();
        
        Cliente c1 = new Cliente("Antony Artavia", "305210249", "85275236", "a@g.com", promocion);
        Cliente c2 = new Cliente("Andres Artavia", "305210248", "85275221", "and@g.com", promocion);
        Cliente c3 = new Cliente("Zhong Liu", "505340123", "84976803", "z@g.com", promocion);
        
        System.out.println("Nuevo descuento a 50%");
        promocion.setDescuento(0.5);
        System.out.println("Nuevo descuento a 15%");
        promocion.setDescuento(0.15);
    }
}
