/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suscripcion;

import java.util.ArrayList;

/**
 *
 * @author Antony Artavia
 */
public abstract class Observable {
    protected ArrayList<ObservadorCliente> observadores = new ArrayList<ObservadorCliente>();

    public Observable() {}
    
    public void addObservador(ObservadorCliente observador) {
        observadores.add(observador);
    }
    
    public ObservadorCliente quitObservador(ObservadorCliente observador) {
        int index = observadores.indexOf(observador);
        
        return observadores.remove(index);
    }
    
    //Falta implementacion
    public abstract void notificarATodos();
}
