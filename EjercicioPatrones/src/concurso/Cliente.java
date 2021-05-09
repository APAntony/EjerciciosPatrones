/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

/**
 *
 * @author liugu
 */
public class Cliente extends Observable{
    private String nombre;
    
    public Cliente(String nombre){
        this.nombre = nombre;
        super.mediador = Mediador.getInstance();
    }
    
    @Override
    public void update(String mensaje) {
        System.out.println(this.nombre + " recibió el siguiente mensaje: " + mensaje);
    }

    public void enviarRespuesta(String mensaje){
        super.mediador.notificar(this, mensaje);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
