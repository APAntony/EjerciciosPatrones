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
public class Cliente extends ObservadorCliente {
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;

    public Cliente(String nombre, String cedula, String telefono, String correo, Promocion obs) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        
        //Enlazamos el "Subject" con el "Observador"
        this.observable = obs;
        this.observable.addObservador(this);
    }
    
    //Falta la implementacion
    @Override
    public void update() {
        System.out.println("Soy en cliente "+nombre+" y veo que hay una promocion"
                + " de "+observable.getDescuento()+"% en productos");
    }
}
