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
public class Mediador {
    private Observador concurso;
    private static Mediador mediadorInstance;
    
    private Mediador(){
        concurso = new Concurso();
    }
    
    public static Mediador getInstance(){
        if (mediadorInstance == null){
            mediadorInstance = new Mediador();
        }
        return mediadorInstance; 
    }
    
    public void notificar(Observable cliente,String mensaje){
        Pregunta pregunta = ((Concurso)concurso).getPregunta();
        if (pregunta == null){
            cliente.update("No existe la pregunta. Espere a que reciba alguna pregunta");
        }
        else{
            String respuesta = pregunta.getRespuesta();
            if (respuesta.equalsIgnoreCase(mensaje)){
                this.concurso.notificar(((Cliente)cliente).getNombre()+ " respondió la pregunta correctamente\nLa respuesta es: " + respuesta);
                ((Concurso)concurso).setPregunta(null);
            } else {
                cliente.update("Respuesta erronea");
            }
        }
    }

    public Observador getConcurso() {
        return concurso;
    }

    public void setConcurso(Observador concurso) {
        this.concurso = concurso;
    }
    
    
}
