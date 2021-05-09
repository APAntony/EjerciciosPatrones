/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.util.ArrayList;

/**
 *
 * @author Antony Artavia Palma
 */
public class Main {
    
    public static void main(String[] args){
        ArrayList<Matriz> matrices = new ArrayList<Matriz>();
        CreadorMatriz creadorM = CreadorMatriz.getInstance();
        
        //Contexto con la estrategia iterativa
        Contexto contexto = new Contexto(new EstrategiaIterativa());
        
        System.out.println("Creacion de 5 matrices");
        matrices.add(creadorM.construirMatriz(3, 3));
        matrices.add(creadorM.construirMatriz(5, 5));
        matrices.add(creadorM.construirMatriz(7, 7));
        matrices.add(creadorM.construirMatriz(4, 4));
        matrices.add(creadorM.construirMatriz(2, 2));

        System.out.println("Evaluacion con Estrategia iterativa");
        matrices.forEach(m -> {
            System.out.println(contexto.evaluar(m));
        });
        
        System.out.println();
        
        //Contexto con la estrategia paralela
        contexto.setEstrategia(new EstrategiaParalela());
        
        System.out.println("Evaluacion con Estrategia paralela");
        matrices.forEach(m -> {
            System.out.println(contexto.evaluar(m));
        });
    }
}
