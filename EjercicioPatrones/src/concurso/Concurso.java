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
public class Concurso extends Observador{
    private Pregunta pregunta;
    
    public Concurso(){
        super.clientes = new ArrayList<Observable>();
        pregunta = null;
    }

    @Override
    public void notificar(String mensaje) {
        for (int i=0;i<super.clientes.size();i++){
            super.clientes.get(i).update(mensaje);
        }
    }

    public void notificarPregunta(Pregunta pregunta){
        this.pregunta = pregunta;
        String preguntaActual = pregunta.getPregunta();
        this.notificar(preguntaActual);
    }
    
    @Override
    public void suscribir(Observable cliente) {
        super.clientes.add(cliente);
    }

    @Override
    public void desuscribir(Observable cliente) {
       super.clientes.remove(cliente);
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    
}
