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
public class Main {
    public static void main(String args[]){
        //Se crea el concurso
        Concurso concurso1 = new Concurso();
        
       Mediador mediador1 = Mediador.getInstance();
       mediador1.setConcurso(concurso1);
       
       Cliente cliente1 = new Cliente("Daniel");
       Cliente cliente2 = new Cliente("Esteban");
       Cliente cliente3 = new Cliente("Valeria");
       Cliente cliente4 = new Cliente("Marpia");
       
       concurso1.suscribir(cliente1);
       concurso1.suscribir(cliente2);
       concurso1.suscribir(cliente3);
       concurso1.suscribir(cliente4);
       
       
       Pregunta pregunta1 = new Pregunta("2+2","4");
       // Se envía la pregunta a los concursantes
       concurso1.notificarPregunta(pregunta1);
       
       // Cada cliente envía la respuesta
       cliente1.enviarRespuesta("2");
       cliente4.enviarRespuesta("3");
       cliente2.enviarRespuesta("4");
       
       cliente3.enviarRespuesta("4");
    }
}
