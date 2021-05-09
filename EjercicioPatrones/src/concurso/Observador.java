/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

import java.util.ArrayList;

/**
 *
 * @author liugu
 */
public abstract class Observador {
    protected ArrayList<Observable> clientes;
    
    public abstract void suscribir(Observable cliente);
    
    public abstract void desuscribir(Observable cliente);
    
    public abstract void notificar(String mensaje);
}
