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
public abstract class ObservadorCliente {
    protected Promocion observable;
    
    //Metodos
    public abstract void update();
}
