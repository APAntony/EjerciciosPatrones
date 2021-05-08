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
public class Cliente extends Observador {
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;

    public Cliente(String nombre, String cedula, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    //Falta la implementacion
    @Override
    public void update() {
        super.update(); //To change body of generated methods, choose Tools | Templates.
    }
}
