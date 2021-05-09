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
public class Promocion extends suscripcion.Observable {
    private double descuento;

    public Promocion() {}
    
    @Override
    public void notificarATodos() {
        for (ObservadorCliente observador : observadores) {
            observador.update();
        }
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
        notificarATodos();
    }
}
