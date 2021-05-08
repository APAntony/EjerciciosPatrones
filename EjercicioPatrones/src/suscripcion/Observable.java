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
    public ArrayList<Observador> observadores;

    public Observable() {}
    
    public void addObservador(Observador observador) {
        observadores.add(observador);
    }
    
    public Observador quitObservador(Observador observador) {
        int index = observadores.indexOf(observador);
        
        return observadores.remove(index);
    }
    
    //Falta implementacion
    public void notificar(String mensaje) {
        
    }
}
