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
public abstract class Observable {
    protected Mediador mediador;
    
    public abstract void update(String mensaje);
}
