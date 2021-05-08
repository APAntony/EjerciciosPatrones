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
        Contexto contextoIterativo = new Contexto(new EstrategiaIterativa());
        
        matrices.add(creadorM.construirMatriz(3, 3));
        matrices.add(creadorM.construirMatriz(5, 5));
        matrices.add(creadorM.construirMatriz(7, 7));
        matrices.add(creadorM.construirMatriz(4, 4));
        matrices.add(creadorM.construirMatriz(2, 2));

        matrices.forEach(m -> {
            System.out.println(contextoIterativo.evaluar(m));
        });
    }
}
